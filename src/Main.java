import stu.leetcode.num11_20.LongestCommonPrefix_14;
import stu.leetcode.num1_10.IsPalindrome_9;
import stu.leetcode.num1_10.LengthOfLongestSubstring_3;
import stu.leetcode.num1_10.Reverse_7;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        int x = -2147483648;
        String[] strs = {"aaa","aa","aaa"};
        System.out.println(new Reverse_7().reverse(x));
        System.out.println(new LengthOfLongestSubstring_3().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new LongestCommonPrefix_14().longestCommonPrefix(strs));
    }
}
