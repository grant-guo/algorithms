package grant.guo.algorithms.list

object IsListPalindrome extends App {
  def IsPalindrome[T](list:List[T]):Boolean = {
    ReverseList.reverse1(list).equals(list)
  }

  println(IsPalindrome(List(1,2,2,2,1)))
  println(IsPalindrome(List(1,2,3,57)))
}
