package stu.leetcode.num1_10;

/**
 * @Author: ls
 * @Date: 2020/2/20 21:30
 */
public class Reverse_7 {
    /*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321

 示例 2:

输入: -123
输出: -321
     */
    //憨憨做法，耗时18ms
//    public int reverse(int x) {
//        long result = x >= 0 ? Long.parseLong(new StringBuffer(x+"").reverse().toString()):
//                -Long.parseLong(new StringBuffer((long)x*(-1)+"").reverse().toString());
//        return result > Integer.MIN_VALUE+1 && result < Integer.MAX_VALUE-1?(int) result : 0;
//    }
    //大佬做法 耗时1ms
    public int reverse(int x) {
        long result = 0;
        while(x!=0){
            result = result*10 + x%10;
            x /= 10;
        }
        return (int)result == result ? (int)result:0;
    }
}
