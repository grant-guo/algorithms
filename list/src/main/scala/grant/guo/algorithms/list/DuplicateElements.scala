package grant.guo.algorithms.list

object DuplicateElements extends App {
  def duplicate[T](list: List[T]): List[T] = {
    list.flatMap(v => List(v, v))
  }

  println(duplicate(List('a, 'b, 'c, 'c, 'd)))

  def duplicateN[T](n: Int, list: List[T]): List[T] = {
    list.flatMap(v => {
      (1 to n).map(number => v)
    })
  }
  println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
}
