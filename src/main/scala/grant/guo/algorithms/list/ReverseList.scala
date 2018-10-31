package grant.guo.algorithms.list

object ReverseList extends App {
  def reverse[T](list: List[T]): List[T] = {
    list match {
      case Nil => Nil
      case value::tail => reverse(tail) ::: List(value) // reverse(tail) :+ value
    }
  }

  def reverse1[T](list: List[T]): List[T] = {
    def reverseR[T](ret: List[T], curr: List[T]): List[T] = {
      curr match {
        case Nil => ret
        case value::tail => reverseR(value::ret, tail)
      }
    }

    reverseR(Nil, list)
  }


  println(reverse(List(1,2,3,4,5)))
  println(reverse1(List(1,2,3,4,5)))
  println(reverse(List(1)))
  println(reverse1(List(1)))
}
