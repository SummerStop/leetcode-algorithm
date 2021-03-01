package stu.jzoffer;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
/**
 * @Author: ls
 * @Date: 2020/12/20 15:31
 */
public class JZ27 {
  public ArrayList<String> Permutation(String str) {
    ArrayList<String> arr = new ArrayList();
    char[] chars = str.toCharArray();
    dfs(arr,chars,0);
    Collections.sort(arr);
    return arr;
  }
  void dfs(ArrayList<String> arrayList,char[] chars,int count){
    if(count == chars.length-1){
      arrayList.add(new String(chars));
    }
    for(int i = count;i < chars.length;i ++){
      if(i != count && chars[i] == chars[count]) continue;
      swap(chars,count,i);
      dfs(arrayList,chars,count+1);
      swap(chars,count,i);
    }
  }

  void swap(char[] chars,int i,int j){
    if(i != j){
      char tmp = chars[i];
      chars[i] = chars[j];
      chars[j] = tmp;
    }
  }
}
