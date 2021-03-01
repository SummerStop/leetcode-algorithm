package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 16:33
 */
public class JZ40 {
  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    int xor = 0;
    for(int i = 0;i < array.length;i ++){
      xor ^= array[i];
    }
    int index = 1;
    while((index & xor)==0){
      index = index << 1;
    }
    for(int i = 0;i < array.length;i ++){
      if((index & array[i]) == 0){
        num1[0] ^= array[i];
      }
      else{
        num2[0] ^= array[i];
      }
    }
  }
}
