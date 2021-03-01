package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 15:57
 */
public class JZ38 {
  public int TreeDepth(TreeNode root) {
    if(root == null) return 0;
    int left = TreeDepth(root.left);
    int right = TreeDepth(root.right);
    return left >= right?left +1:right+1;
  }
}
