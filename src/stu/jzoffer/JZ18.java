package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/17 23:07
 */
public class JZ18 {
  public void Mirror(TreeNode root) {
    if(root == null) return ;
    TreeNode tmp = root.left;
    root.left = root.right;
    root.right = tmp;
    Mirror(root.left);
    Mirror(root.right);
  }
}
