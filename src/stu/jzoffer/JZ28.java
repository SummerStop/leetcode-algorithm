package stu.jzoffer;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
/**
 * @Author: ls
 * @Date: 2020/12/20 23:50
 */
public class JZ28 {
  public int MoreThanHalfNum_Solution(int [] array) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0;i < array.length;i ++){
      if(!map.containsKey(array[i])){
        map.put(array[i], 1);
      }
      else{
        int count = map.get(array[i]).intValue()+1;
        map.put(array[i], count);
      }
    }
    int max = 0;
    int num = -1;
    for(Entry<Integer, Integer> entry:map.entrySet()){
      if(entry.getValue() > max){
        max = entry.getValue();
        num = entry.getKey();
      }
    }

    return max > array.length/2?num:0;
  }
}
