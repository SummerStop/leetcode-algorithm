package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/30 23:31
 */
public class JZ64 {
  public ArrayList<Integer> maxInWindows(int [] num, int size)
  {
    if(size > num.length ||size == 0|| num == null || num.length == 0) return new ArrayList<Integer>();

    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0;i + size-1< num.length;i ++){
      arr.add(getMax(num,i,i+size-1));
    }
    return arr;
  }
  int getMax(int[] arr,int start,int end){
    int max = arr[start];
    for(int i = start;i <= end;i ++){
      max = max < arr[i]?arr[i]:max;
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = {10,14,12,11};
  System.out.println(new JZ64().maxInWindows(arr,0));
  }
}
