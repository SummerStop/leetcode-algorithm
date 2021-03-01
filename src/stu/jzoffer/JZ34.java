package stu.jzoffer;

import java.util.HashMap;

/**
 * @Author: ls
 * @Date: 2020/12/26 15:49
 */
public class JZ34 {
  public int FirstNotRepeatingChar(String str) {
    if(str == null||str.length() == 0) return -1;
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i = 0;i < str.length();i ++){
      if(!map.containsKey(str.charAt(i))){
        map.put(str.charAt(i),i);
      }
      else{
        map.put(str.charAt(i),-1);
      }
    }
    int index = Integer.MAX_VALUE;
    for(Integer value:map.values()){
      if(value != -1){
        index = Math.min(index,value);
      }
    }
    return index == Integer.MAX_VALUE?-1:index;
  }
}
