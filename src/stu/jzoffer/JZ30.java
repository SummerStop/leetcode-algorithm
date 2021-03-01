package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/21 0:27
 */
public class JZ30 {
  public int FindGreatestSumOfSubArray(int[] array) {
    int max = array[0];
    for(int i = 1;i < array.length; i ++){
      array[i] += array[i-1]>0?array[i-1]:0;
      max = Math.max(max,array[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = {-5,-2,-3,-1};
    System.out.println(new JZ30().FindGreatestSumOfSubArray(arr));
  }
}
