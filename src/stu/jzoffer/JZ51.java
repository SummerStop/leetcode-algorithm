package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/27 16:28
 */
public class JZ51 {
  // 抄
  public int[] multiply(int[] A) {
       /* int[] B = new int[A.length];
		for(int i = 0;i < B.length;i ++){
			int multiply = 1;
			int j = 0;
			while(j < A.length){
				multiply *= j == i?1:A[j];
				j ++;
			}
			B[i] = multiply;
		}
		return B;*/
    int[] B = new int[A.length];
    if(A != null){
      B[0] = 1;
      for(int i = 1;i < A.length;i ++){
        B[i] = B[i - 1]*A[i - 1];
      }
      int temp = 1;
      for(int j = A.length - 2;j >= 0;j --){
        temp *= A[j+1];
        B[j] *= temp;
      }
    }
    return B;
  }
}
