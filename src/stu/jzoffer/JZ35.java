package stu.jzoffer;

/**
 * @Author: ls
 * @Date: 2020/12/26 16:43
 */
public class JZ35 {
  public int InversePairs(int [] arr) {
    int[] temp = new int[arr.length];
    int count = InversePairsCore(arr, 0, arr.length-1, temp);
    return count;
  }

  public static int InversePairsCore(int[] arr, int start, int end, int[] temp) {
    if (start == end) {
      return 0;
    }
    int middle = (start + end)>>1;
    int count = 0;
    int i = middle, j = end, index = end;
    int leftCount = InversePairsCore(arr, start, middle, temp);
    int rightCount = InversePairsCore(arr, middle + 1, end, temp);
    while (i >= start && j >= middle+1) {
      if (arr[i] > arr[j]) {
        count += j - middle;
        temp[index--] = arr[i--];
        if (count >= 1000000007) {
          count %= 1000000007;
        }
      } else {
        temp[index--] = arr[j--];
      }
    }

    while (i >= start) {
      temp[index--] = arr[i--];
    }
    while (j >= middle+1) {
      temp[index--] = arr[j--];
    }
    for(int k=start; k<=end; k++) {
      arr[k] = temp[k];
    }
    return (count + leftCount + rightCount) % 1000000007;
  }


  // 超时
  public int InversePairs1(int [] array) {
    if(array == null||array.length == 0) return 0;
    int start = 0,end = array.length-1;
    int count = 0;
    while(start <  end){
      int l = start;
      while(l < end){
        if(array[l] > array[end]){
          count = count % 1000000007 +1;
        }
        l ++;
      }
      end --;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,6,7,0};
    System.out.println(new JZ35().InversePairs(arr));
  }
}
