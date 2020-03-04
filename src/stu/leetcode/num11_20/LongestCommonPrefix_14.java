package stu.leetcode.num11_20;

/**
 * @Author: ls
 * @Date: 2020/2/27 23:10
 */
public class LongestCommonPrefix_14 {
    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     * 如果不存在公共前缀，返回空字符串 ""。
     * 示例 1:
     * 输入: ["flower","flow","flight"]
     * 输出: "fl"
     * 示例 2:
     * 输入: ["dog","racecar","car"]
     * 输出: ""
     * 解释: 输入不存在公共前缀。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-common-prefix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    //有点想偷懒，来个憨憨暴力解法吧  1ms  37.8MB
    //看成了是公共子串，做了好久都没过，一些测试用例考虑也不周全出错，有点lj啊
    //这个算法是两两比较，找出两个字符串中的最长的公共串，再将公共串与另外一个字串做比较
//    public String longestCommonPrefix(String[] strs) {
//        if(strs.length == 0) return "";
//        String pre_str = strs[0];
//        if(strs.length == 1) return pre_str;
//        if(pre_str.equals("")) return "";
//        for(int i = 1;i < strs.length;i ++){
//            int j = 0;
//            for(;j < pre_str.length()&&j < strs[i].length();j ++){
//                if(strs[i].charAt(j) != pre_str.charAt(j)){
//                    break;
//                }
//            }
//            pre_str = pre_str.substring(0,j);
//            if("".equals(pre_str)) return "";
//        }
//        return pre_str;
//    }


    //0ms 无情
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0||strs == null) return "";
        String preStr = strs[0];
        for(String str:strs){
            while(!str.startsWith(preStr)){
                if(preStr.length() == 1) return "";
                preStr = preStr.substring(0,preStr.length()-1);
            }
        }
        return preStr;
    }


}
