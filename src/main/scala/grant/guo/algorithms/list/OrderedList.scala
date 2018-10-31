package grant.guo.algorithms.list

object OrderedList extends App {
  def isListOrdered(list: List[Int]): Boolean = {
    list.length match {
      case 1 => true
      case 2 => list(0) < list(1)
      case _ => {
        val (l, r) = list.splitAt(list.length/2)
        if((l(l.length-1) < r(0)) && isListOrdered(l) && isListOrdered(r))
          true
        else
          false
      }
    }
  }

  println(isListOrdered(List(3,5,7,21,34,1)))
  println(isListOrdered(List(1,3,5,7,21,34)))
  println(isListOrdered(List(3,5,7,21,34)))
  println(isListOrdered(List(100)))
  println(isListOrdered(List(2, 1)))


}
