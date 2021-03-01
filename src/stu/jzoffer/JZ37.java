package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 15:56
 */
public class JZ37 {
  public int GetNumberOfK(int [] array , int k) {
    int count = 0;
    for(int i = 0;i < array.length;i ++){
      if(k == array[i]){
        count ++;
      }
    }
    return count;
  }
}
