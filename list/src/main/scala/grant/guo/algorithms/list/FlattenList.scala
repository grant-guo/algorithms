package grant.guo.algorithms.list

object FlattenList extends App {
  def flatten(list: List[Any]): List[Any] = {
    list.flatMap(element => {
      element match {
        case l:List[_] => flatten(l)
        case l => List(l)
      }
    })
  }

  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}
