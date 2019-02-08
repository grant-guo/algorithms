package grant.guo.algorithms.dp.longestIncreasingSubsequence

object LongestIncreasingSubsequence extends App {

  /**
    * the basic idea is to loop the list to check the longest increasing subsequence ending with each number
    *
    * @param last list of (Int, Int), the left is the original number, the right is the longest increasing subsequence ending with this number
    * @param current
    */
  def iis(last: List[(Int, Int)], current: List[Int]):Int = {
    current match {
      case head :: tail => {
        val newTuple = last match {
          case Nil => (head, 1)
          case _ => {
            last.map(tuple => {
              if(head > tuple._1) (head, tuple._2 + 1) else (head, 1)
            }).maxBy(tuple => {
              tuple._2
            })
          }
        }

        tail match {
          case Nil => {
            (last :+ newTuple).foldLeft(0) { (left, right) => {
              if(right._2 > left) right._2 else left
            }}
          }
          case _ => iis(last :+ newTuple, tail)
        }

      }//end of case
    }
  }

  println(iis(List.empty, List(10, 22, 9, 33, 21, 50, 41, 60, 80)))

  println((iis(List.empty, List(6,5,4,3,2,1))))

  println(iis(List.empty, List(10, 22, 9, 33, 21, 50, 41, 60)))
}
