package grant.guo.algorithms.list

object RotateList extends App {
  def rotate[T](n: Int, list: List[T]): List[T] = {
    def rotateR(k: Int, head: List[T], curr: List[T]): List[T] = {
      (k, curr) match {
        case (0, tail) => curr ::: head.reverse
        case (_, Nil) => head.reverse
        case (_, h::tail) => rotateR(k-1, h::head, tail)
      }
    }
    rotateR(n, Nil, list)
  }
  println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def rotate1[T](n: Int, list: List[T]): List[T] = {
    val (l, r) = SplitAt.split(n, list)
    r ::: l
  }
  println(rotate1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
