package stu.leetcode.num1_10;

/**
 * @Author: ls
 * @Date: 2020/9/7 22:06
 */
public class LongestPalindrome_5 {

  public String longestPalindrome(String s) {
    if(s == null || s.length() < 2) return s;
    int maxLen = 1;
    int begin = 0;
    char[] charArray = s.toCharArray();
    boolean[][] dp = new boolean[s.length()][s.length()];
    for(int i = 0;i < s.length();i ++){
      dp[i][i] = true;
    }

    for(int j = 0;j < s.length() - 1;j ++){
      for(int i = 0;i < j;i ++){
        if(charArray[i] != charArray[j]){
          dp[i][j] = false;
        }
        else{
          if(j-i+1 <= 3){
            dp[i][j] = true;
          }
          else{
            dp[i][j] = dp[i+1][j-1];
          }
        }

        if(dp[i][j]&&j-i+1 > maxLen){
          begin = i;
          maxLen = j-i+1;
        }
      }
    }
    return s.substring(begin,begin+maxLen);
  }
}
