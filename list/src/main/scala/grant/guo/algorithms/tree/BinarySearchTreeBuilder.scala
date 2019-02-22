package grant.guo.algorithms.tree

/**
  *
  *                          10
  *                        /    \
  *                       9     20
  *                      /     /  \
  *                     5     15  21
  *                    / \
  *                   3   6
   */
object BinarySearchTreeBuilder {
  def getBST(): TreeNode[Int] = {
    TreeNode[Int](
      value = 10,
      left = TreeNode[Int](
        value = 9,
        left = TreeNode[Int](
          value = 5,
          left = TreeNode[Int](
            value = 3
          ),
          right = TreeNode[Int](
            value = 6
          )
        )
      ),
      right = TreeNode[Int](
        value = 20,
        left = TreeNode[Int](
          value = 15
        ),
        right = TreeNode[Int](
          value = 21
        )
      )
    )
  }
}
