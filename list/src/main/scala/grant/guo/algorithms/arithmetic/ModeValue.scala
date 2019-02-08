package grant.guo.algorithms.arithmetic

/*

The mode is the number that is repeated more often than any other
 */
object ModeValue extends App {

  def modeR(list: List[Int]): Map[Int, Int] = {
    list match {
      case header :: Nil => Map(header -> 1)
      case header :: tail :: Nil if(header == tail) => Map(header -> 2)
      case header :: tail :: Nil if(header != tail) => Map(header ->1, tail -> 1)
      case _ => {
        val (left, right) = list.splitAt(list.size/2)
        mergeMap(
          modeR(left), modeR(right)
        )
      }
    }
  }

  private def mergeMap(left: Map[Int, Int], right: Map[Int, Int]): Map[Int, Int] = {
    (left.toSeq ++ right.toSeq).groupBy(_._1).map(tuple => {
      (tuple._1, tuple._2.foldLeft(0){(_ + _._2)})
    })
  }

  val list = modeR(List(13, 18, 13, 14, 13, 16, 14, 21, 13)).toList
  println(list)

  val ret =
  list.tail.foldLeft(list.head){(left, right) => {
    (right._2 > left._2) match {
      case true => right
      case false => left
    }
  }}

  println(ret)


}
