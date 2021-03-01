package stu.leetcode.num11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: ls
 * @Date: 2021/1/13 23:52
 */
public class ThreeSum_15 {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    if(nums == null || nums.length == 0){
      return res;
    }
    Arrays.sort(nums);
    for(int i = 0;i < nums.length-2;i ++){
      if(i != 0 && nums[i-1] == nums[i]) continue;
      int left = i+1;
      int right = nums.length - 1;
      while(left < right){
        if(nums[left] + nums[right] + nums[i] > 0){
          right --;
        }
        else if(nums[left] + nums[right] + nums[i] < 0){
          left ++;
        }
        else if(nums[left] + nums[right] + nums[i] == 0){
          res.add(Arrays.asList(nums[left],nums[right],nums[i]));
          while(left < right && nums[left+1] == nums[left]) left ++;
          while(left < right && nums[right] == nums[right-1]) right --;
          left ++;
          right --;
        }
      }
    }
    return res;
  }
}
