package stu.leetcode.num31_40;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ls
 * @Date: 2021/1/30 16:30
 */
public class CombinationSum_39 {
  List<List<Integer>> res = new ArrayList<>();

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    if(candidates == null || candidates.length == 0){
      return res;
    }
    solution(candidates,target,0,new ArrayList<>());
    return res;
  }

  public void solution(int[] candidates,int target,int index,List<Integer> list){
    if(target == 0){
      res.add(new ArrayList<Integer>(list));
    }
    if(index >= candidates.length || target < 0){
      return ;
    }
    for(int i = index;i < candidates.length;i ++){
      list.add(candidates[i]);
      solution(candidates,target-candidates[i],i,list);
      list.remove(list.size()-1);
    }
  }

  public static void main(String[] args) {
    int[] a = {2,2,3};
    int[] b = {2,3,2};
    System.out.println(a == b);
  }
}
