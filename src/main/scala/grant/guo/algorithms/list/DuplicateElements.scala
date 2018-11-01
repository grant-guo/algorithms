package grant.guo.algorithms.list

object DuplicateElements extends App {
  def duplicate(list: List[Symbol]): List[Symbol] = {
    list.flatMap(v => List(v, v))
  }

  println(duplicate(List('a, 'b, 'c, 'c, 'd)))

  def duplicateN(n: Int, list: List[Symbol]): List[Symbol] = {
    list.flatMap(v => {
      (1 to n).map(number => v)
    })
  }
  println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
}
