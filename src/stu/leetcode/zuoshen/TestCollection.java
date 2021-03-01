package stu.leetcode.zuoshen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Author: ls
 * @Date: 2020/11/15 17:04
 */
public class TestCollection {
//  Thread
  HashMap
  List<String> list = new Vector<>();
  void test(){
    list.add("");
  }
  Hashtable<String,String> table = new Hashtable<>();
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    Map<String,String> map = new HashMap<>();
    Map<String, String> treeMap = new TreeMap<>();
    Map<String,String> map1 = new LinkedHashMap<>();
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(4);

    for (int i = 0; i < list.size(); i++) {
      if(2 == list.get(i)){
        list.remove(i);
        i --;
      }
      System.out.println(list.get(i));
    }

    System.out.println("list=" + list.toString());

  }
}
