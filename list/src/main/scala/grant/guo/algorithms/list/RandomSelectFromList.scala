package grant.guo.algorithms.list

object RandomSelectFromList extends App {
  val list = List(1, 2, 3, 4, 5, 6)
  val NUM = 3

  def select(lst: List[Int], num: Int): List[List[Int]] = {
    lst match {
      case _ if(num == 1) => lst.map(List(_))
      case head :: tail if(lst.size >= num) => {
        select(tail, num -1).map(head +: _) ::: select(tail, num)
      }
    }
  }
}
