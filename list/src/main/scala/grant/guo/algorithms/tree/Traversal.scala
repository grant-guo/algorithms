package grant.guo.algorithms.tree

import scala.collection.mutable.Stack
import scala.collection.mutable.ListBuffer

object Traversal extends App {
  def inorder_recursive(node: TreeNode[Int]): List[Int] = {
    def inorderR(ret: List[Int], curr: TreeNode[Int]): List[Int] = {
      Option(curr) match {
        case None => ret
        case Some(_) => {
          (inorderR(ret, curr.left) :+ curr.value) ::: inorderR(ret, curr.right) // generate asc list
//          (inorderR(ret, curr.right) :+ curr.value) ::: inorderR(ret, curr.left) // generate desc list
        }
      }
    }
    inorderR(List.empty, node)
  }

  def inorder_non_recursive(root: TreeNode[Int]): List[Int] = {
    val stack = Stack[TreeNode[Int]]()
    val list = ListBuffer[Int]()

    var curr = root

    while(curr != null || !stack.isEmpty) {
      while(curr != null) {
        stack.push(curr)
        curr = curr.left
      }

      curr = stack.top
      list.append(curr.value)
      stack.pop()

      curr = curr.right

    }
    list.toList
  }

  println(inorder_recursive(BinarySearchTreeBuilder.getBST()))
  println(inorder_non_recursive(BinarySearchTreeBuilder.getBST()))


  def preorder_recursive(node: TreeNode[Int]): List[Int] = {
    def preorderR(ret: List[Int], node: TreeNode[Int]): List[Int] = {
      Option(node) match {
        case None => ret
        case Some(_) => {
          (node.value +: preorderR(ret, node.left)) ::: preorderR(ret, node.right)
        }
      }
    }
    preorderR(List.empty, node)
  }

  def preorder_non_recursive(root: TreeNode[Int]): List[Int] = {
    val stack = Stack[TreeNode[Int]]()
    val list = ListBuffer[Int]()

    stack.push(root)

    while(!stack.isEmpty) {
      val curr = stack.pop()
      list.append(curr.value)
      if(curr.right != null)
        stack.push(curr.right)
      if(curr.left != null)
        stack.push(curr.left)
    }

    list.toList
  }

  println(preorder_recursive(BinarySearchTreeBuilder.getBST()))
  println(preorder_non_recursive(BinarySearchTreeBuilder.getBST()))


  def postorder_recursive(node: TreeNode[Int]): List[Int] = {
    def postorderR(ret: List[Int], node: TreeNode[Int]): List[Int] = {
      Option(node) match {
        case None => ret
        case Some(_) => {
          (postorderR(ret, node.left) ::: postorderR(ret, node.right)) :+ node.value
        }
      }
    }
    postorderR(List.empty, node)
  }

  def postorder_non_recursive(root: TreeNode[Int]): List[Int] = {
    val stack = Stack[TreeNode[Int]]()
    val list = ListBuffer[Int]()

???
  }

  println(postorder_recursive(BinarySearchTreeBuilder.getBST()))
}
