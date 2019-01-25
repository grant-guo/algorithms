package grant.guo.algorithms.arithmetic

import io.reactivex.Observable

/**
  * sort the array or list first,
  * if the size of collection is odd, get the middle number
  * if the size of collection is even, get the two middle number, and average them
  */
object MedianValue extends App {

  def median(list: List[Int], loc: Int): Float = {
    list match {
      case header :: Nil => header
      case header :: tail if(tail.size == loc) => header
      case header :: tail if(tail.size == (loc+1) ) => (header + tail.head)/2
      case _ :: tail => median(tail, loc+1)
    }
  }

  Observable.just(List(2,4,71,54,1).sortWith(_<_)).doOnNext(list => {
    println(list)
  }).subscribe(list => {
    println(median(list, 0))
  })

  Observable.just(List(2,4,71,54,1,0).sortWith(_<_)).doOnNext(println _)
    .subscribe(list => {println(median(list, 0))})

}
