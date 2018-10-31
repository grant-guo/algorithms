package grant.guo.algorithms.list

object PackConsecutiveDuplicates extends App {

  def pack(list: List[Symbol]): List[List[Symbol]] = {
    def packR(ret: List[List[Symbol]], curr: List[Symbol]): List[List[Symbol]] = {
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
    * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    *
    * @param list
    * @return
    */
  def encode(list: List[Symbol]): List[(Int, Symbol)] = {
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
  def encodeModified(list: List[Symbol]): List[Any] = {
    encode(list).map(l => {
      l._1 match {
        case 1 => l._2
        case _ => l
      }
    })
  }
  println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

}
