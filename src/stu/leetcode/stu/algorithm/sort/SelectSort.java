package stu.leetcode.stu.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/7/21 23:34
 * 先选出最小的放在最前面
 */
public class SelectSort {
  public void selectSort(int[] arr){
    if(arr.length <= 1)return;
    for(int i = 0;i <= arr.length-2;i ++){
      for(int j = i+1;j <=arr.length-1;j ++){
        if(arr[i] > arr[j]){
          swap(arr,i,j);
        }
      }
    }
  }
  void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    new SelectSort().selectSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
