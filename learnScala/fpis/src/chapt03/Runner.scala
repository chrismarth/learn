package chapt03

/**
  * Created by racerx on 12/10/15.
  */
object Runner {

  def main(args: Array[String]) = {
    val x = List(1,2,3,4) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)

    }
    //println(List.tail(List(1,2,3,4)))
    //println(List.tail(List(1)))
    //println(List.tail(Nil))
    //println(List.setHead(5, List(1,2,3,4)))
    //println(List.drop(List(1), 2))
    //println(List.length(List(1,2,3,4)))
    println(List.dropWhile(List(1,2,3,4))((x) => x < 2))
    //println(List.init(List(1,2)))

  }
}
