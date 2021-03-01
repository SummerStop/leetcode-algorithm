package stu.jzoffer;

/**
 * 剑指offer 系列代码，尽量手写，再用编辑器
 * @Author: ls
 * @Date: 2020/12/8 23:39
 */
public class JZ1 {
  // 手撕
  // 有序数组  -- 联想二分法
  public boolean Find(int target, int [][] arr) {
    if(arr == null && arr.length == 0) return false;
    for(int i = 0;i < arr.length;i ++){
      int low = 0;
      int high = arr[i].length-1;
      while(low <= high){
        int middle = (low+high)/2;
        if(arr[i][middle] < target){
          low =middle + 1;
        }
        else if(arr[i][middle] > target){
          high =middle- 1;
        }
        else{
          return true;
        }
      }
    }
    return false;
  }

  // 根据有序数组的特点
  public boolean Find1(int target, int [][] arr){
    int col = 0;
    int column = arr[col].length - 1;
    while(col<arr.length&&column >= 0){
      if(target == arr[col][column]){
        return true;
      }
      else if(target > arr[col][column]){
        col ++;
      }
      else if(target < arr[col][column]){
        column --;
      }
    }
    return false;
  }
}
