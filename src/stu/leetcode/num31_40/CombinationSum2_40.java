package stu.leetcode.num31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: ls
 * @Date: 2021/1/30 16:52
 */
public class CombinationSum2_40 {
  public List<List<Integer>> res = new ArrayList<>();

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {

    if(candidates == null || candidates.length == 0){
      return res;
    }
    Arrays.sort(candidates);
    dfs(candidates,target,0,new ArrayList<Integer>());
    Set<List<Integer>> set = new HashSet<>(res);
    res = new ArrayList<>(set);
    return res;
  }

  public void dfs(int[] candidates,int target,int index,List<Integer> arr ){
    if(target == 0){
      res.add(new ArrayList<Integer>(arr));
    }
    if(target < 0 || index >= candidates.length){
      return ;
    }
    for(int i = index;i < candidates.length;i ++){
      arr.add(candidates[i]);
      dfs(candidates,target-candidates[i],i+1,arr);
      arr.remove(arr.size() - 1);
    }
  }
}
