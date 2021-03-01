package stu.leetcode.num11_20;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2021/1/17 22:09
 */
public class ThreeSumClosest_16 {
  public int threeSumClosest(int[] nums, int target) {
    if(nums == null || nums.length < 3){
      return -1;
    }
    int res = Integer.MAX_VALUE,sum = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for(int i = 0;i < nums.length-2;i ++){
      int left = i + 1;
      int right = nums.length -1;
      while(left < right){
        int tmp = nums[i] + nums[left] + nums[right];
        if(Math.abs(tmp-target) < res){
          res = Math.abs(tmp-target);
          sum = tmp;
        }
        if(tmp < target){
          left ++;
        }
        else if(tmp > target){
          right --;
        }
        else{
          return target;
        }
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = {-4,-1,1,2};
    System.out.println(new ThreeSumClosest_16().threeSumClosest(arr,1));
  }
}
