package grant.guo.algorithms.list

object DropNth extends App {
  def drop[T](n: Int, list: List[T]): List[T] = {
    def dropR(k: Int, checked: List[T], curr: List[T]): List[T] = {
      (k, curr) match {
        case (0, h :: tail) => checked.reverse ::: tail
        case (_, Nil) => throw new Exception("k is out of range")
        case (_, h :: tail) => dropR(k-1, h::checked, tail)
      }
    }

    dropR(n, Nil, list)
  }
  println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def drop1[T](n: Int, list: List[T]): List[T] = {
    (n, list) match {
      case (0, h :: tail) => tail
      case (_, Nil) => throw new Exception("k is out of range")
      case (_, h :: tail) => h :: drop1(n-1, tail)
    }
  }
  println(drop1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def drop2[T](n: Int, list: List[T]): List[T] = {
    list.take(n) ::: list.drop(n+1)
  }
  println(drop2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))


}
