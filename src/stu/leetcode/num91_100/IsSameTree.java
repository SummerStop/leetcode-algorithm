package stu.leetcode.num91_100;

/**
 * @Author: ls
 * @Date: 2020/8/29 10:35
 */
public class IsSameTree {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
     }
  }
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null&&q == null){
      return true;
    }
    if(p!=null&&q!=null){
      if(p.val == q.val){
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
      }
    }
    return false;
  }

}
