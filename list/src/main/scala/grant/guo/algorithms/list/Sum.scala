package grant.guo.algorithms.list

object Sum extends App {
  def sum(list: List[Int]):Int = {
    list.foldLeft(0)(_+_)
  }

  println(sum(List(1,2,3,4,5,6,7)))

  def sum1(list: List[Int]):Int = {
    list match {
      case Nil => 0
      case l if(l.length == 1) => l(0)
      case _ => {
        val (l, r) = list.splitAt(list.length/2)
        sum1(l) + sum(r)
      }
    }
  }
  println(sum1(List(1,2,3,4,5,6,7)))
}
