package stu.jzoffer;

import java.util.ArrayList;

/**
 * @Author: ls
 * @Date: 2020/12/26 16:49
 */
public class JZ41 {
  public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
    ArrayList<Integer> arr =new ArrayList<>();
    ArrayList<ArrayList<Integer>> result =new ArrayList<>();
    int length = (sum+1)/2;
    int start = 1;
    int end = 2;
    int curSum = start + end;

    while(end <= length){
      if(curSum > sum){
        curSum -= start;
        start ++;
      }
      else if(curSum < sum){
        end ++;
        curSum += end;
      }
      else{
        for(int i = start;i <= end;i ++){
          arr.add(i);
        }
        result.add(new ArrayList<Integer>(arr));
        arr.clear();
        end ++;
        curSum += end;
      }
    }
    return result;
  }
}
