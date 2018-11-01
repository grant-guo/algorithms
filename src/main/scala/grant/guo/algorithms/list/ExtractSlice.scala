package grant.guo.algorithms.list

object ExtractSlice extends App {
  def slice(start: Int, end: Int, list: List[Symbol]): List[Symbol] = {
    SplitAt.split(end-start, SplitAt.split(start, list)._2)._1
  }
  println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def removeSlice(start: Int, end: Int, list: List[Symbol]): List[Symbol] = {
    val (l, r) = SplitAt.split(start, list)
    l ::: SplitAt.split(end-start, r)._2
  }

  println(removeSlice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
