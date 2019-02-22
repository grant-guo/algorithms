package grant.guo.algorithms.tree

import scala.collection.mutable.{ListBuffer, Stack}

object FindSecondLargeInBST extends App {

  def findSecondLargeInBST(root: TreeNode[Int]): Int = {
    val stack = Stack[TreeNode[Int]]()
    val list = ListBuffer[Int]()

    var curr = root

    while((curr != null || !stack.isEmpty) && list.size < 2) {
      while(curr != null) {
        stack.push(curr)
        curr = curr.right
      }

      curr = stack.top
      list.append(curr.value)
      stack.pop()

      curr = curr.left

    }
    list(1)
  }

  println(findSecondLargeInBST(BinarySearchTreeBuilder.getBST()))
}
