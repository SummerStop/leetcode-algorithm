package stu.algorithm.sort;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/7/21 23:01 两两比较，大的往后，小的在前
 */
public class BubbleSort {

  public void bubbleSort(int[] arr) {
    if (arr.length <= 1) {
      return;
    }
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
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
    new BubbleSort().bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
}
