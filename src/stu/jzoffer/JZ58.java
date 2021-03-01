package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/29 23:57
 */
public class JZ58 {
  boolean isSymmetrical(TreeNode pRoot)
  {
    if(pRoot == null) return true;
    return isSymmetricalCore(pRoot.left,pRoot.right);
  }
  boolean isSymmetricalCore(TreeNode left,TreeNode right){
    if(left == null && right == null) return true;
    if(left == null || right == null) return false;
    return left.val == right.val &&
        isSymmetricalCore(left.left,right.right) &&
        isSymmetricalCore(left.right,right.left);
  }
}
