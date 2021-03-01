package stu.jzoffer;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
/**
 * @Author: ls
 * @Date: 2020/12/19 16:18
 */
public class JZ22 {
  public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    ArrayList<Integer> arr = new ArrayList<>();
    if(root == null) return arr;

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      int count = 0;
      while(count < size){
        TreeNode node = queue.poll();
        arr.add(node.val);
        if(node.left != null){
          queue.offer(node.left);
        }
        if(node.right != null){
          queue.offer(node.right);
        }
        count ++;
      }

    }
    return arr;
  }
}
