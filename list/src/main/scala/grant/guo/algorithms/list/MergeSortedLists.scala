package grant.guo.algorithms.list

object MergeSortedLists extends App {

  def mergeLists(list1: List[Int], list2:List[Int]): List[Int] = {
    (list1, list2) match {
      case (head1::tail1, head2::tail2) => {
        if(head1 == head2){
          head2 :: head1:: mergeLists(tail1, tail2)
        }
        else if(head1 < head2){
          head1 :: mergeLists(tail1, list2)
        }
        else {
          head2 :: mergeLists(list1, tail2)
        }
      }
      case (Nil, Nil) => {
        return Nil
      }
      case (_, Nil) => {
        return list1
      }
      case (Nil, _) => {
        return list2
      }
    }
  }

  mergeLists(
    List(23, 44, 46, 80, 200),
    List(45, 67, 90,122, 567)
  ).foreach(num => print(num + ","))
}
