package stu.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/7/20 22:43
 */
public class QuickSort {

  public void sort(int[] arr,int left,int right){
    if(left < right){
      int i = partition(arr,left,right);
      sort(arr,left,i-1);
      sort(arr,i+1,right);
    }
  }

  int partition(int[] arr,int left,int right){
    int base = arr[left];
    while(left < right){
      while (left < right&&arr[right] >= base){
        right --;
      }
      arr[left] = arr[right];
      while (left < right&&arr[left] <= base){
        left ++;
      }
      arr[right] = arr[left];
    }
    arr[left] = base;
    return left;
  }

  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    new QuickSort().sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
