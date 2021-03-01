package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/20 15:04
 */
public class JZ24 {
  ArrayList<ArrayList<Integer>> result = new ArrayList<>();
  ArrayList<Integer> arr = new ArrayList<>();
  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
    if(root == null) return result;
    arr.add(root.val);
    if(root.val == target && root.left == null && root.right == null){
      result.add(new ArrayList(arr));
    }
    FindPath(root.left,target-root.val);
    FindPath(root.right,target-root.val);
    arr.remove(arr.size()-1);
    return result;
  }
}
