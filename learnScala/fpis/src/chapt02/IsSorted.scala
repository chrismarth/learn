package chapt02

/**
  * Created by racerx on 12/10/15.
  */
object IsSorted {

  def isSorted[A](as: Array[A], ordered:(A,A) => Boolean) : Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(n >= as.length-1)
        true
      else if (ordered(as(n),as(n+1)))
        loop(n+1)
      else
        false
    }
    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println(isSorted(Array(1,2,3,4), (x:Int,y:Int) => x <= y))
  }
}
