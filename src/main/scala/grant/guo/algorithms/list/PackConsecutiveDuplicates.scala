package grant.guo.algorithms.list

object PackConsecutiveDuplicates extends App {

  def pack[T](list: List[T]): List[List[T]] = {
    def packR(ret: List[List[T]], curr: List[T]): List[List[T]] = {
      curr match {
        case Nil => ret.reverse
        case value :: tail => {
          packR((value :: tail.takeWhile(_.equals(value))) :: ret, tail.dropWhile(_.equals(value)))
        }
      }
    }
    packR(Nil, list)
  }

  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  /**
    * encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[(Int, T)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    *
    * @param list
    * @return
    */
  def encode[T](list: List[T]): List[(Int, T)] = {
    pack(list).map(l => {
      (
        l.length,
        l(0)
      )
    })
  }
  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))


  /**
    * encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    *
    * @param list
    * @return
    */
  def encodeModified[T](list: List[T]): List[Any] = {
    encode(list).map(l => {
      l._1 match {
        case 1 => l._2
        case _ => l
      }
    })
  }
  println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}
