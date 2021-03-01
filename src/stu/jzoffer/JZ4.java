package stu.jzoffer;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/12/10 22:53
 */
class TreeNode {

  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public class JZ4 {

  public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    if (pre == null || in == null || pre.length == 0 || in.length == 0) {
      return null;
    }

    TreeNode head = new TreeNode(pre[0]);
    if(pre.length == 1) return head;
    for(int i = 0;i < in.length;i ++){
      if(pre[0] == in[i]){
        head.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
        head.right = reConstructBinaryTree(Arrays.copyOfRange(pre,1+i,pre.length),Arrays.copyOfRange(in,i+1,in.length));

      }
    }
    return head;

  }
}
