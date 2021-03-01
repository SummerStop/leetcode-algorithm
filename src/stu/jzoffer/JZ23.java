package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/20 14:42
 */
public class JZ23 {
  public boolean VerifySquenceOfBST(int [] sequence) {
    if(sequence == null || sequence.length == 0) return  false;
    return isTree(sequence,0,sequence.length-1);
  }
  boolean isTree(int[] sequence,int start,int end){
    if(start >= end) return true;
    int endValue = sequence[end];
    int less = -1;
    int more = end;
    for(int i = start;i < end;i ++){
      if(sequence[i] < endValue){
        less = i;
      }
      else{
        more = more == end?i:more;
      }
    }
    if(less == -1||more == end){
      return isTree(sequence,start,end-1);
    }
    if(less+1 != more) return false;
    return isTree(sequence,start,less)&&isTree(sequence,more,end-1);
  }
}
