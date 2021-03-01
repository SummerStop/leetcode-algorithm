package stu.jzoffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: ls
 * @Date: 2020/12/28 23:59
 */
public class JZ54 {
  private Map<Character, Integer> map = new LinkedHashMap<>();

  //Insert one char from stringstream
  public void Insert(char ch) {
    if (map.containsKey(ch)) {
      map.put(ch, map.get(ch) + 1);
    } else {
      map.put(ch, 1);
    }
  }

  //return the first appearence once char in current stringstream
  public char FirstAppearingOnce() {
    for (Map.Entry<Character, Integer> set : map.entrySet()) {
      if (set.getValue() == 1) {
        return set.getKey();
      }
    }
    return '#';
  }
}
