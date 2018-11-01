package grant.guo.algorithms.list

object DropNth extends App {
  def drop(n: Int, list: List[Symbol]): List[Symbol] = {
    def dropR(k: Int, checked: List[Symbol], curr: List[Symbol]): List[Symbol] = {
      (k, curr) match {
        case (0, h :: tail) => checked.reverse ::: tail
        case (_, Nil) => throw new Exception("k is out of range")
        case (_, h :: tail) => dropR(k-1, h::checked, tail)
      }
    }

    dropR(n, Nil, list)
  }
  println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def drop1(n: Int, list: List[Symbol]): List[Symbol] = {
    (n, list) match {
      case (0, h :: tail) => tail
      case (_, Nil) => throw new Exception("k is out of range")
      case (_, h :: tail) => h :: drop1(n-1, tail)
    }
  }
  println(drop1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def drop2(n: Int, list: List[Symbol]): List[Symbol] = {
    list.take(n) ::: list.drop(n+1)
  }
  println(drop2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))


}
