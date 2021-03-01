package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/27 16:34
 */
public class JZ52 {
  public boolean match(char[] str, char[] pattern)
  {
    if(str == null || pattern == null) return false;
    return matchCode(str,0,pattern,0);
  }

  public boolean matchCode(char[] str,int preIndex,char[] pattern,int matchIndex){
    if(str.length == preIndex && pattern.length == matchIndex){
      return true;
    }
    if(str.length != preIndex && pattern.length == matchIndex){
      return false;
    }
    if(matchIndex + 1 < pattern.length && pattern[matchIndex + 1] == '*'){
      if((preIndex != str.length && pattern[matchIndex] == str[preIndex])
          || (pattern[matchIndex] == '.' && preIndex != str.length)){
        return matchCode(str,preIndex+1,pattern,matchIndex)||
            matchCode(str,preIndex+1,pattern,matchIndex+2)
            ||matchCode(str,preIndex,pattern,matchIndex+2);
      }
      else{
        return matchCode(str,preIndex,pattern,matchIndex+2);
      }

    }
    if(preIndex < str.length && pattern[matchIndex] == '.'||
        preIndex < str.length && pattern[matchIndex] == str[preIndex]){
      return matchCode(str,preIndex+1,pattern,matchIndex+1);
    }
    return false;
  }

}
