package grant.guo.algorithms.list

object Range extends App {
  def range(start:Int, end:Int): List[Int] = {
    start match {
      case c if(c == end) => List(c)
      case c => List(c) ::: range(start+1, end)
    }
  }
  println(range(4,9))

  def range1(start:Int, end:Int): List[Int] = {
    def rangeR(curr:Int, end:Int, head: List[Int]): List[Int] = {
      if(curr == end)
        head ::: List(curr)
      else
        rangeR(curr+1, end, head:::List(curr))
    }
    rangeR(start, end, Nil)
  }
  println(range1(4,9))
}
