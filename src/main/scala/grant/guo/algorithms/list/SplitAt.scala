package grant.guo.algorithms.list

object SplitAt extends App {
  def split(n: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = {
    def splitR(k: Int, head: List[Symbol], curr: List[Symbol]): (List[Symbol], List[Symbol]) = {
      (k, curr) match {
        case (0, tail) => (head.reverse, tail)
        case (_, Nil) => throw new Exception("n is out of range")
        case (_, h :: tail) => splitR(k-1, h::head, tail)
      }
    }
    splitR(n, Nil, list)
  }
  println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def split1(n: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = {
    list.splitAt(n)
  }
  println(split1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

  def split2(n: Int, list: List[Symbol]): (List[Symbol], List[Symbol]) = {
    (n, list) match {
      case (0, tail) => (Nil, tail)
      case (_, Nil) => throw new Exception("n is out of range")
      case (_, h::tail) => {
        val (l, r) = split2(n-1, tail)
        (l ::: List(h), r)
      }
    }
  }
  println(split1(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

}
