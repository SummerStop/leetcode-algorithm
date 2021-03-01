package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/30 0:46
 */
public class JZ62 {
  int count = 0;
  TreeNode KthNode(TreeNode pRoot, int k)
  {
    if(pRoot == null || k == 0) return null;
    TreeNode node = KthNode(pRoot.left,k);
    if(node != null) return node;

    if(++count == k) return pRoot;
    node = KthNode(pRoot.right,k);
    if(node != null)  return node;
    return null;
  }
}
