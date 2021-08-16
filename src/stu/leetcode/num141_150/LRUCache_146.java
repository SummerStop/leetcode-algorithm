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

  // O(n)实现
//  private int capacity;
//  private HashMap<Integer,Integer> cache;
//  private List<Integer> order;
//  LRUCache_146(int capacity){
//    this.capacity = capacity;
//    order =new LinkedList<>();
//    cache = new HashMap(capacity);
//  }
//
//  int get(int key){
//    if(!cache.containsKey(key)){
//      return -1;
//    }
//    order.remove(new Integer(key));
//    order.add(0,key);
//    return cache.get(key);
//  }
//
//  void put(int key,int value){
//    if(cache.containsKey(key)){
//      cache.put(key,value);
//      order.remove(new Integer(key));
//      order.add(0,key);
//    }
//    else{
//      if(order.size() < capacity){
//        order.add(0,key);
//      }
//      else{
//        cache.remove(order.get(order.size()-1));
//        order.remove(order.size()-1);
//        order.add(0,key);
//      }
//      cache.put(key,value);
//    }
//  }

  class DLinkedNode {
    int key;
    int value;
    DLinkedNode prev;
    DLinkedNode next;
    public DLinkedNode() {}
    public DLinkedNode(int _key, int _value) {key = _key; value = _value;}
  }

  private Map<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();
  private int size;
  private int capacity;
  private DLinkedNode head, tail;

  public LRUCache_146(int capacity) {
    this.size = 0;
    this.capacity = capacity;
    // 使用伪头部和伪尾部节点
    head = new DLinkedNode();
    tail = new DLinkedNode();
    head.next = tail;
    tail.prev = head;
  }

  public int get(int key){
    DLinkedNode node = cache.get(key);
    if(node == null){
      return -1;
    }
    // 将该节点移动到对头
    return node.value;
  }

  public void put(int key,int value){
    if(cache.containsKey(key)){
      // 重置key
      // 将node移动到队头
    }
    else{
      // 判断是否超过最大容量
      if(size >= capacity){
        // 移除队尾node
        // 新建node对象
        // 将对象移动到对头
      }
      else{
        // 新建对象
        // 将对象移动到队头
      }
    }
  }
  private void addToHead(DLinkedNode node) {
    node.prev = head;
    node.next = head.next;
    head.next.prev = node;
    head.next = node;
  }

  private void removeNode(DLinkedNode node) {
    node.prev.next = node.next;
    node.next.prev = node.prev;
  }

  private void moveToHead(DLinkedNode node) {
    removeNode(node);
    addToHead(node);
  }

  private DLinkedNode removeTail() {
    DLinkedNode res = tail.prev;
    removeNode(res);
    return res;
  }

}
