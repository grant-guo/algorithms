package grant.guo.algorithms.list

object FindLast extends App {

  def findLast[T](list: List[T]): T = {
    list match {
      case last::Nil => last
      case _::tail => findLast(tail)
      case _ => throw new Exception("Wrong target list!")
    }
  }

  println(findLast(List(1,2,3,6,100)))
  println(findLast(List(1)))
  println(findLast(List()))

}
