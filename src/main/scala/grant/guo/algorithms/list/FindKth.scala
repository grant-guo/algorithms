package grant.guo.algorithms.list

object FindKth extends App {
  def findKth[T](k: Int, list: List[T]): T = {
    (k, list) match {
      case (0, value :: tail) => value
      case (_, _::tail) => findKth(k-1, tail)
      case (_, Nil) => throw new Exception("There are no enough elements in the list")
    }
  }
  println(findKth(0, List(1,2,5,6,7,9,10)))
  println(findKth(6, List(1,2,5,6,7,9,10)))
  println(findKth(3, List(1,2,5,6,7,9,10)))
  println(findKth(100, List(1,2,5,6,7,9,10)))
}
