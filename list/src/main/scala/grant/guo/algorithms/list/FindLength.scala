package grant.guo.algorithms.list

import scala.annotation.tailrec

object FindLength extends App {
  def findLength[T](list: List[T]): Int = {
    list match {
      case Nil => 0
      case _ :: tail => 1 + findLength(tail)
    }
  }

  def findLength1[T](list:List[T]): Int = {
    @tailrec
    def findLengthR[T](length: Int, curr:List[T]): Int = {
      curr match {
        case Nil => length
        case _::tail => findLengthR(length+1, tail)
      }
    }

    findLengthR(0, list)
  }

  println(findLength(List(1)))
  println(findLength(List(1,2,3)))
  println(findLength1(List(1)))
  println(findLength1(List(1,2,3)))
}
