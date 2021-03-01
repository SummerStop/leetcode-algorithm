package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/14 22:14
 */
public class JZ6 {
  public int minNumberInRotateArray(int [] array) {
    int low = 0;
    int high = array.length - 1;
    while(low < high){
      int middle =low + (high - low)/2;
      if(array[middle] > array[high]){
        low = middle+1;
      }
      else if(array[middle] < array[high]){
        high = middle;
      }
      else{
        high = high - 1;
      }
    }
    return array[high];
  }
}
