package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/29 0:26
 */

 class TreeLinkNode {
  int val;
  TreeLinkNode left = null;
  TreeLinkNode right = null;
  TreeLinkNode next = null;

  TreeLinkNode(int val) {
    this.val = val;
  }
}
public class JZ57 {
  public TreeLinkNode GetNext(TreeLinkNode pNode)
  {
    if(pNode == null) return null;
    if(pNode.right != null){
      return getMostRight(pNode.right);
    }
    else{
      TreeLinkNode parent = pNode.next;
      while(parent != null && parent.left != pNode){
        pNode = parent;
        parent = parent.next;
      }
      return parent;
    }

  }

  public TreeLinkNode getMostRight(TreeLinkNode pNode){
    while(pNode.left != null){
      pNode = pNode.left;
    }
    return pNode;
  }
}
