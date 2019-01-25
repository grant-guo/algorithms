package grant.guo.algorithms.arithmetic

/**
  * sort the array or list first,
  * if the size of collection is odd, get the middle number
  * if the size of collection is even, get the two middle number, and average them
  */
object MedianValue extends App {
//  val nums = List(2,4,71,54,1,0).sortWith(_<_)
  val nums = List(2,4,71,54,1).sortWith(_<_)

  println(nums)

  def median(list: List[Int], loc: Int): Float = {
    list match {
      case header :: Nil => header
      case header :: tail if(tail.size == loc) => header
      case header :: tail if(tail.size == (loc+1) ) => (header + tail.head)/2
      case _ :: tail => median(tail, loc+1)
    }
  }
  val value = median(nums, 0)
  println(value)
}
