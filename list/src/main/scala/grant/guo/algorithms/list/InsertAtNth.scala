package grant.guo.algorithms.list

object InsertAtNth extends App {
  def insertAt[T](e: T, n:Int, list: List[T]): List[T] = {
    val (l, r) = SplitAt.split(n, list)
    l ::: (e::r)
  }
  println(insertAt('new, 1, List('a, 'b, 'c, 'd)))

  def insertAt1[T](e: T, n:Int, list: List[T]): List[T] = {
    def insertAtR(k: Int, head: List[T], curr: List[T]): List[T] = {
      (k, curr) match {
        case (0, tail) => head.reverse ::: (e::tail)
        case (_, Nil) => head.reverse ::: List(e)
        case (_, h::tail) => insertAtR(k-1, h::head, tail)

      }
    }
    insertAtR(n, Nil, list)
  }
  println(insertAt1('new, 1, List('a, 'b, 'c, 'd)))
}
