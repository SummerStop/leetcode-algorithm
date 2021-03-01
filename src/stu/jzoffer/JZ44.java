package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 18:37
 */
public class JZ44 {
  public String ReverseSentence(String str) {
    StringBuilder sb = new StringBuilder();
    String[] strs = str.split(" ");
    if(strs.length == 0){
      return str;
    }
    for(int i = strs.length-1;i >= 0;i --){
      sb.append(strs[i]+" ");
    }
    return sb.toString().trim();
  }
}
