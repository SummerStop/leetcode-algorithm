package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2021/1/2 15:59
 */
import  java.util.*;
public class JZ59 {
  public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    if(pRoot == null) return arr;
    queue.offer(pRoot);
    boolean isLeft = true;
    while(!queue.isEmpty()){
      ArrayList<Integer> list = new ArrayList<>();

      int size = queue.size();
      for(int i = 0;i < size;i ++){
        TreeNode tmp = queue.poll();
        list.add(tmp.val);
        if(tmp.left != null){
          queue.offer(tmp.left);
        }
        if(tmp.right != null){
          queue.offer(tmp.right);
        }
      }
      if(!isLeft){
        Collections.reverse(list);
      }
      isLeft = !isLeft;
      arr.add(list);

    }
    return arr;
  }

}
