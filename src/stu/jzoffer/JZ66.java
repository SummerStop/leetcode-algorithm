package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2021/1/6 0:30
 */
public class JZ66 {
  public int movingCount(int threshold, int rows, int cols)
  {
    boolean[][] arr = new boolean[rows][cols];
    int[] count = new int[1];
    count[0] = 0;
    movingCountCore(arr,threshold,0,0,rows,cols,count);
    return count[0];
  }
  void movingCountCore(boolean[][] arr,int threshold,int i,int j,int rows,int cols,int[] count){
    if(i < 0|| j < 0||i >= rows || j >= cols || arr[i][j]
        ||(getNum(i)+getNum(j)) > threshold){
      return ;
    }
    count[0] += 1;
    arr[i][j] = true;

    movingCountCore(arr,threshold,i-1,j,rows,cols,count);
    movingCountCore(arr,threshold,i+1,j,rows,cols,count);
    movingCountCore(arr,threshold,i,j-1,rows,cols,count);
    movingCountCore(arr,threshold,i,j+1,rows,cols,count);
  }

  int getNum(int num){
    int sum = 0;
    while(num != 0){
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}
