package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 15:58
 */
public class JZ39 {
  public boolean IsBalanced_Solution(TreeNode root) {
    if(root == null) return true;
    boolean[] res = new boolean[1];
    res[0] = true;
    getHigh(root,res);
    return res[0];
  }
  int getHigh(TreeNode node,boolean[] res){
    if(node == null) {
      res[0] = true;
      return 0;
    }
    int left = getHigh(node.left,res);
    if(!res[0]) return left;
    int right = getHigh(node.right,res);
    if(!res[0]) return right;
    if(Math.abs(left - right) > 1) res[0] = false;
    return Math.max(left,right) +1;

  }
}
