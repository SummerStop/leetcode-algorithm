package stu.algorithm.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ls
 * @Date: 2020/7/22 23:21
 */
public class ShellSort {
  public void shellSort(int[] arr){
    if(arr.length <= 1)return ;
    for(int gap = arr.length/2;gap >= 1;gap /= 2){
      for(int i = gap;i < arr.length;i += gap){
        int temp = arr[i];
        int j = i-gap;
        while (j >= 0&&arr[j] > temp){
          arr[j+gap] = arr[j];
          j -= gap;
        }
        arr[j+gap] = temp;
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    new ShellSort().shellSort(arr);
    Map<String,String> map = new HashMap<>();
    System.out.println(Arrays.toString(arr));
  }
}
