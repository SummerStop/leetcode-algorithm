package stu.leetcode.num1_10;

/**
 * @Author: ls
 * @Date: 2021/1/11 22:59
 */
public class MyAtoi_8 {
  public int myAtoi(String str) {
    str = str.trim();
    char[] strArr = str.toCharArray();
    long res = 0L;
    boolean flag = true;
    for(int i = 0;i < strArr.length;i ++){
      if(i == 0 && (strArr[i] < '0' || strArr[i] > '9')){
        if(strArr[i] == '-'){
          flag = false;
          continue;
        }
        else if(strArr[i] == '+'){
          continue;
        }
        else{
          return 0;
        }
      }
      if(strArr[i] >= '0' && strArr[i] <= '9'){
        res = res*10 + (strArr[i] - '0');
        if(res > Integer.MAX_VALUE && flag){
          return Integer.MAX_VALUE;
        }
        else if(-1 * res < Integer.MIN_VALUE && !flag){
          return Integer.MIN_VALUE;
        }
      }
      else{
        break;
      }
    }
    if(res > Integer.MAX_VALUE && flag){
      return Integer.MAX_VALUE;
    }
    else if(-1 * res < Integer.MIN_VALUE && !flag){
      return Integer.MIN_VALUE;
    }
    return flag?(int)res:(int)res * -1;
  }

  public static void main(String[] args) {
    char c = '9';
    System.out.println(Long.MIN_VALUE);
    System.out.println(new MyAtoi_8().myAtoi("9223372036854775808"));
  }

}
