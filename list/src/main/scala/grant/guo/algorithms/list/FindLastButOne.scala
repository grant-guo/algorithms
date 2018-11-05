package grant.guo.algorithms.list

object FindLastButOne extends App {
  def findLastButOne[T](list: List[T]): T = {
    list match {
      case one :: _ :: Nil => one
      case _ :: tail => findLastButOne(tail)
      case _ => throw new Exception("Wrong target list!")
    }
  }

  println(findLastButOne(List(1,2,3,4)))
  println(findLastButOne(List(1,2)))
//  println(findLastButOne(List(1)))
  println(findLastButOne(List()))
}
