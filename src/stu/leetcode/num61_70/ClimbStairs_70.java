package stu.leetcode.num61_70;

/**
 * @Author: ls
 * @Date: 2020/8/10 23:10
 */
public class ClimbStairs_70 {
  /*
  假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
  每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
  注意：给定 n 是一个正整数。
  来源：力扣（LeetCode）
  链接：https://leetcode-cn.com/problems/climbing-stairs
  著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   */

  /**
   * fn = fn-1+fn-2
   * @param n
   * @return
   */
  public int climbStairs(int n) {
    if(n == 1) return 1;
    if(n == 2) return 2;
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
//    要超时
//    if(n == 1)return 1;
//    if(n == 2)return 2;
//    return climbStairs(n-1)+climbStairs(n-2);
  }

  public static void main(String[] args) {
    System.out.println(new ClimbStairs_70().climbStairs(45)); //1836311903
  }

}
