package stu.leetcode.num141_150;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import sun.misc.LRUCache;

/**
 * @Author: ls
 * @Date: 2020/12/6 11:20
 */
public class LRUCache_146 {

  /**
   * 使用linkedHashMap能力实现
   */
//  private int capacity;
//  private LinkedHashMap<Integer,Integer> cache;
//
//  public LRUCache_146(int capacity) {
//    this.capacity = capacity;
//    cache = new LinkedHashMap<Integer,Integer>(capacity,0.75f,true){
//      @Override
//      protected boolean removeEldestEntry(Map.Entry eldset){
//        return size() > capacity;
//      }
//    };
//  }
//
//  public int get(int key) {
//    return cache.getOrDefault(key,-1);
//  }
//
//  public void put(int key, int value) {
//    cache.put(key,value);
//  }


  private int capacity;
  private HashMap<Integer,Integer> cache;
  private List<Integer> order;

  LRUCache_146(int capacity){
    this.capacity = capacity;
    order =new LinkedList<>();
    cache = new HashMap(capacity);
  }

  int get(int key){
    if(!cache.containsKey(key)){
      return -1;
    }
    order.remove(new Integer(key));
    order.add(0,key);
    return cache.get(key);
  }

  void put(int key,int value){
    if(cache.containsKey(key)){
      cache.put(key,value);
      order.remove(new Integer(key));
      order.add(0,key);
    }
    else{
      if(order.size() < capacity){
        order.add(0,key);
      }
      else{
        cache.remove(order.get(order.size()-1));
        order.remove(order.size()-1);
        order.add(0,key);
      }
      cache.put(key,value);
    }
  }
}
