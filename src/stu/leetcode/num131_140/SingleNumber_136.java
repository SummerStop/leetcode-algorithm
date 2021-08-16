package stu.leetcode.num131_140;

/**
 * @Author: ls
 * @Date: 2021/3/21 17:57
 */
public class SingleNumber_136 {
  public int singleNumber(int[] nums) {
    if(nums == null || nums.length == 0){
      return 0;
    }
    int xor = 0;
    for(int i = 0;i < nums.length;i ++){
      xor = xor ^ nums[i];
    }
    return xor;
  }
}
