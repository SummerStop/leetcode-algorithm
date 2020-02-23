package stu.leetcode.num1_10;

/**
 * @Author: ls
 * @Date: 2020/2/23 11:27
 */
public class LengthOfLongestSubstring_3 {
/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
示例 1:
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
    //绝妙的算法 使用可变的步长，设一个头节点和尾节点，遍历字符串
    //新来一个字符，与前面的步长中的字符作比较，如果步长有着字符，则头节点移到步长中这字符位置的后一位
    //在结果集中，比较原步长的长度和加入这字符后的步长，取大的一个，存入结果集
    //10ms
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        //保存中间结果
        int[] dp = new int[s.length()+1];
        for(int i = 0;i < s.length();i ++){
            //判断截取中的字符串没有第i个字符
            if(s.substring(l,i).indexOf(s.charAt(i)) != -1){
                l = s.indexOf(s.charAt(i),l)+1;
            }
            dp[i+1] =Math.max(dp[i],i-l+1);
        }
        return dp[s.length()];
    }

    //憨憨做法  意思一样，但是没有上述简洁，使用了变量代替数组来保存结果
//    public int lengthOfLongestSubstring(String s) {
//        int count = 0;
//        if(s == null||s.length() == 0){
//            return count;
//        }
//        String str = "";
//        for(int i = 0;i < s.length();i ++){
//            if(!str.contains(s.charAt(i)+"")){
//                str += s.charAt(i);
//                if(str.length()>count) count = str.length();
//            }
//            else{
//                int index = str.indexOf(s.charAt(i));
//                str = str.substring(index+1)+s.charAt(i);;
//            }
//        }
//        return count;
//    }

}
