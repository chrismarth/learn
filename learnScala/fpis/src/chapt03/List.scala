package chapt03

/**
  * Created by racerx on 12/10/15.
  */
sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]

object List {

  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case Cons(x, Nil) => 1
    case Cons (x, xs) => 1 + length(xs)
  }

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x,xs) => x + sum(xs)
  }

  def tail[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case Cons(x, xs) => xs
  }

  def drop[A](list: List[A], n: Int): List[A] = {
    if (n <= 0)
      list
    else if (n > length(list))
      Nil
    else
      drop(tail(list), n-1)
  }

  def dropWhile[A](list: List[A])(f: A => Boolean) : List[A] = list match {
    case Nil => Nil
    case Cons (x, xs) if f(x) => dropWhile(xs)(f)
    case _ => list
  }

  def setHead[A](head: A, list: List[A]): List[A] = list match {
    case Nil => Nil
    case Cons(x,xs) => Cons(head, xs)
  }

  def init[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case Cons(h, t) if (length(t) >= 1) => Cons(h, init(t))
    case _ => Nil
  }

  def apply[A](as: A*): List[A] = {
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }
}
