package grant.guo.algorithms.list

object ExtractSlice extends App {
  def slice[T](start: Int, end: Int, list: List[T]): List[T] = {
    SplitAt.split(end-start, SplitAt.split(start, list)._2)._1
  }
  println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def removeSlice[T](start: Int, end: Int, list: List[T]): List[T] = {
    val (l, r) = SplitAt.split(start, list)
    l ::: SplitAt.split(end-start, r)._2
  }

  println(removeSlice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
