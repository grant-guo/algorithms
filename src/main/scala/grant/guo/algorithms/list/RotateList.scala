package grant.guo.algorithms.list

object RotateList extends App {
  def rotate(n: Int, list: List[Symbol]): List[Symbol] = {
    def rotateR(k: Int, head: List[Symbol], curr: List[Symbol]): List[Symbol] = {
      (k, curr) match {
        case (0, tail) => curr ::: head.reverse
        case (_, Nil) => head.reverse
        case (_, h::tail) => rotateR(k-1, h::head, tail)
      }
    }
    rotateR(n, Nil, list)
  }
  println(rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
}
