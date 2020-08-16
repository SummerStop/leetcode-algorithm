package stu.leetcode.num61_70;

/**
 * @Author: ls
 * @Date: 2020/8/16 15:24
 */
public class AddBinary_67 {

  /**
   * 给你两个二进制字符串，返回它们的和（用二进制表示）。
   * 输入为 非空 字符串且只包含数字 1 和 0。
   */
  public String addBinary(String a, String b) {
    StringBuilder ans = new StringBuilder();
    a = new StringBuilder(a).reverse().toString();
    b = new StringBuilder(b).reverse().toString();
    int length = Math.max(a.length(),b.length()),carry = 0;
    for(int i = 0;i < length;i ++){
      int a1 = 0,b1 = 0;
      if(i < a.length()){
        a1 = a.charAt(i)-'0';
      }
      if(i < b.length()){
        b1 = b.charAt(i) - '0';
      }
      int ans1 = (a1+b1+carry)%2;
      carry = (a1+b1+carry)/2;
      ans.append(ans1);
    }
    if(carry != 0){
      ans.append(carry);
    }
    return ans.reverse().toString();
  }

  public static void main(String[] args) {
    String a = "1011",b = "101";
    System.out.println(new AddBinary_67().addBinary(a,b));
  }
}
