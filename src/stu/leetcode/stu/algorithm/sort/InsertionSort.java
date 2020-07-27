package stu.leetcode.stu.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/7/21 23:45
 * 假定前面一部分有序，后面无序，让后面的每个数插入到前面有序数组中
 */
public class InsertionSort {
  public void insertionSort(int[] arr){
    if(arr.length <= 1)return ;
    for(int i = 1;i < arr.length;i ++){
      int temp = arr[i];
      int j =i-1;
      while (j >=0&&arr[j] > temp){
        arr[j+1] = arr[j--];
      }
      arr[j+1] = temp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    new InsertionSort().insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
