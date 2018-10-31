package grant.guo.algorithms.list

object DelConsecutiveDuplicates extends App {
  def compress(list: List[Symbol]): List[Symbol] = {
    def compressR(ret: List[Symbol], curr: List[Symbol]): List[Symbol] = {
      curr match {
        case Nil => ret.reverse
        case value :: tail => compressR(value::ret, tail.dropWhile(_.equals(value)))
      }
    }

    compressR(Nil, list)
  }

  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}
