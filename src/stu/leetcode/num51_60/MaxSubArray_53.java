package stu.leetcode.num51_60;

/**
 * @Author: ls
 * @Date: 2020/8/3 22:50
 */
public class MaxSubArray_53 {

  // 经典的最大子序和问题
  //func1 贪心法  1ms
  public int maxSubArray(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int sum = nums[0], max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (sum <= 0) {
        sum = nums[i];
        max = sum > max ? sum : max;
      } else {
        sum += nums[i];
        max = sum > max ? sum : max;
      }
    }
    return max;
  }

  //func2 动态规划 -- 骚操作来了
  /**
   * 以nums[i]为结尾点的最大子序和，那么max{f(i)}为最终结果
   * f(i) = max{f(i)+nums[i],nums[i]}
   */
  public int maxSubArray1(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    }
    int max = nums[0], pre = nums[0];
    for (int i = 1; i < nums.length; i++) {
      pre = Math.max(pre + nums[i],nums[i]);
      max = Math.max(pre, max);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(new MaxSubArray_53().maxSubArray1(arr));
  }

}
