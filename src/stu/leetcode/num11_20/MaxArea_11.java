package stu.leetcode.num11_20;

/**
 * @Author: ls
 * @Date: 2021/1/28 22:06
 */
public class MaxArea_11 {

  // 超时
  public int maxArea(int[] height) {
    int area = 0;
    if(height == null || height.length == 0) return area;
    for(int i = 0;i < height.length - 1;i ++){
      for(int j = i+1;j < height.length;j ++){
        if(area < calcuAre(height,i,j)){
          area = calcuAre(height,i,j);
        }
      }
    }
    return area;
  }

  public int calcuAre(int[] height,int i,int j){
    int length = j - i;
    if(height[i] == 0|| height[j] == 0){
      return 0;
    }
    return height[i] > height[j] ? height[j]*length:height[i]*length;
  }


  //  使用动态规划
  public int maxArea1(int[] height) {
    if(height == null || height.length <= 1) return -1;
    int area = -1;
    int i = 0,j = height.length-1;
    while(i < j){
      // 算出当前面积
      int res = height[i] > height[j] ? height[j] * (j - i) : height[i] * (j - i);
      area = Math.max(area,res);
      if(height[i] > height[j]){
        j --;
      }
      else{
        i ++;
      }
    }
    return area;
  }

}
