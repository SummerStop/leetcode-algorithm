package stu.leetcode.num11_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ls
 * @Date: 2021/1/18 21:56
 */
public class LetterCombinations_17 {
  public List<String> letterCombinations(String str) {
    String[] dir = new String[10];
    dir[2] = "abc";
    dir[3] = "def";
    dir[4] = "ghi";
    dir[5] = "jkl";
    dir[6] = "mno";
    dir[7] = "pqrs";
    dir[8] = "tuv";
    dir[9] = "wxyz";
    char[] carr = str.toCharArray();
    List<String> res = new ArrayList();
    if ("".equals(str) || str == null) {
      return res;
    }
    char[] path = new char[carr.length];
    process(carr, 0, res, dir,"");
    return res;
  }

  public void process(char[] carr,int i, List<String> res,String[] dir,String str){
    if(i == carr.length){
      res.add(str);
      return ;
    }

    for(int j = 0;j < dir[carr[i]-'0'].length();j ++){
      process(carr,i+1,res,dir,str+dir[carr[i]-'0'].charAt(j));
    }
  }
}
