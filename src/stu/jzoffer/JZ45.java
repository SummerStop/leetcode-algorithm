package stu.jzoffer;

import java.util.Arrays;

/**
 * @Author: ls
 * @Date: 2020/12/26 18:39
 */
public class JZ45 {
  public boolean isContinuous(int [] numbers) {
    if(numbers == null ||numbers.length == 0) return false;
    Arrays.sort(numbers);
    int zeroNum = 0,zeroNeed = 0;
    for(int i = 0;i < numbers.length;i ++){
      if(numbers[i] == 0){
        zeroNum ++;
      }
      else if(i + 1 < numbers.length){
        zeroNeed += numbers[i+1] - numbers[i] - 1;
      }
    }
    return zeroNum == zeroNeed||zeroNum == 4;
  }
}
