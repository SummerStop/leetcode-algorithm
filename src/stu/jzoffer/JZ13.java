package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/17 21:52
 */
public class JZ13 {
  public void reOrderArray(int [] array) {
    int k = 0;
    for(int i = 0;i < array.length;i ++){
      if((array[i] & 1) == 1){
        int j = i;
        while(j > k){
          int tmp = array[j];
          array[j] = array[j-1];
          array[j-1] = tmp;
          j --;
        }
        k ++;
      }

    }
  }
}
