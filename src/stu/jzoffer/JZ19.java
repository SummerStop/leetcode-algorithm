package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/17 23:11
 */
public class JZ19 {
  public ArrayList<Integer> printMatrix(int [][] matrix) {
    ArrayList<Integer> arr = new ArrayList<>();
    int row = matrix.length;
    int column = matrix[0].length;
    int layer = (Math.min(row,column)+1)/2;
    for(int i = 0; i < layer;i ++){
      for(int j = i; j < column - i;j ++){
        arr.add(matrix[i][j]);
      }
      for(int k = i+1;k < row - i;k ++){
        arr.add(matrix[k][column-i-1]);
      }
      for(int m = column-i-2;(m >= i)&&(row-i-1)!=i; m --){
        arr.add(matrix[row-i-1][m]);
      }
      for(int n = row-i-2;(n > i)&&(column-i-1)!=i;n --){
        arr.add(matrix[n][i]);
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[][] arr = {{1},{2},{3},{4}};
    System.out.println(new JZ19().printMatrix(arr));
  }
}
