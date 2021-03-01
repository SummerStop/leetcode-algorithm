package stu.jzoffer;

import java.util.ArrayList;


/**
 * @Author: ls
 * @Date: 2020/12/20 23:55
 */
public class JZ29 {
  public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    ArrayList<Integer> list = new ArrayList<>();
    if(input.length < k) return list;
    solution(input,0,input.length -1,k);
    for(int i = 0;i < k;i ++){
      list.add(input[i]);
    }
    return list;
  }

  void solution(int[] arr,int start,int end,int k){
    if(start < end){
      int cur = partition(arr,start,end);
      if(cur == k) return ;
      solution(arr,start,cur-1,k);
      solution(arr,cur+1,end,k);
    }
  }

  int partition(int[] arr,int start,int end){
    int base = arr[start];
    while(start < end){
      while(start < end && arr[end] >= base ){
        end --;
      }
      arr[start] = arr[end];
      while(start < end && arr[start] <= base){
        start ++;
      }
      arr[end] = arr[start];
    }
    arr[start] = base;
    return start;
  }
}
