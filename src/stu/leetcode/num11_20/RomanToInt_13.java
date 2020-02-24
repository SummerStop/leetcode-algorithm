package stu.leetcode.num11_20;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ls
 * @Date: 2020/2/24 22:21
 */
public class RomanToInt {
    /**
     * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，
     * 所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/roman-to-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    //首先肯定需要保存字符对应的值，可使用map来保存，也可使用函数
    public int getValue(char ch){
        switch (ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    //题目意思即为每两个字符做对比，若左边比右边小，做减法，否则，做加法，若没有下一位了，则把这位加上
    //5 ms
    public int romanToInt(String s) {
        int prenum = getValue(s.charAt(0));
        int sum = 0;
        for(int i = 1;i < s.length();i ++){
            int nextnum = getValue(s.charAt(i));
            sum += prenum < nextnum?(-prenum):prenum;
            prenum = nextnum;
        }
        //把最后一位加上
        return sum+prenum;
    }
}
