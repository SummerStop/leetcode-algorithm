package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/17 23:06
 */
public class JZ17 {
  public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    if(root1 == null || root2 == null) return false;

    return isTree(root1,root2)||HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);

  }

  boolean isTree(TreeNode node1,TreeNode node2){
    if(node2 == null) return true;
    if(node1 == null) return false;
    if(node2.val == node1.val){
      return isTree(node1.left,node2.left) && isTree(node1.right,node2.right);
    }
    else{
      return false;
    }
  }
}
