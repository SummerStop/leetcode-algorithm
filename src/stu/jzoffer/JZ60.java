package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2021/1/2 16:00
 */
import java.util.*;
public class JZ60 {
  ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    Queue<TreeNode> queue = new LinkedList<>();
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    if(pRoot == null){
      return arr;
    }
    queue.offer(pRoot);
    while(!queue.isEmpty()){
      ArrayList<Integer> list = new ArrayList<>();
      int size = queue.size();
      for(int i = 0; i < size;i ++){
        TreeNode node = queue.poll();
        list.add(node.val);
        if(node.left != null){
          queue.offer(node.left);
        }
        if(node.right != null){
          queue.offer(node.right);
        }
      }
      arr.add(list);
    }
    return arr;
  }
}
