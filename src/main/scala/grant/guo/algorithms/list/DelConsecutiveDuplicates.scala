package grant.guo.algorithms.list

object DelConsecutiveDuplicates extends App {
  def compress[T](list: List[T]): List[T] = {
    def compressR(ret: List[T], curr: List[T]): List[T] = {
      curr match {
        case Nil => ret.reverse
        case value :: tail => compressR(value::ret, tail.dropWhile(_.equals(value)))
      }
    }

    compressR(Nil, list)
  }

  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
