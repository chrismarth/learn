package chapt02

/**
  * Created by racerx on 11/24/15.
  */
object Fibonacci {

  def fibonacci(n: Int) : Int = {
    @annotation.tailrec
    def go (n1: Int, n2: Int, i: Int, n: Int) : Int = {
      if (i < n) {
        if (i <= 1)
          go(0,0,i+1,n)
        else if (i == 2)
          go(1,0,i+1,n)
        else
          go(n1+n2,n1,i+1,n)
      } else {
        n1+n2
      }
    }
    go(0,0,1,n)
  }

  def main (args: Array[String]) {
    println(fibonacci(8))
  }
}
