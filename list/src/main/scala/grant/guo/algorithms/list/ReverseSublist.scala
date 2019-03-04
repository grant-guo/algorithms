package grant.guo.algorithms.list

object ReverseSublist extends App {

  def reverseSublist[T](list: List[T], start: Int, end: Int): List[T] = {
    val (lst1, lst2) = SplitAt.split(start, list)
    val (lst3,  lst4) = SplitAt.split(end-start, lst2)
    lst1 ::: ReverseList.reverse(lst3) ::: lst4
  }

}
