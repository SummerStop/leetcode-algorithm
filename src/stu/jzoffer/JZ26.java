package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/20 15:23
 */
public class JZ26 {
  TreeNode head = null;
  TreeNode realHead = null;
  public TreeNode Convert(TreeNode pRootOfTree) {
    if(pRootOfTree == null) return null;
    dfs(pRootOfTree);
    return realHead;
  }
  void dfs(TreeNode node){
    if(node == null) return ;
    dfs(node.left);
    if(head == null){
      head = node;
      realHead = node;
    }
    else{
      head.right = node;
      node.left = head;
      head = node;
    }
    dfs(node.right);
  }
}
