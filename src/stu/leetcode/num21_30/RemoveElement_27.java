package stu.leetcode.num21_30;

/**
 * @Author: ls
 * @Date: 2020/7/27 23:14
 */
public class RemoveElement_27 {
  /**
   * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
   * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
   * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
   * 示例 1:
   * 给定 nums = [3,2,2,3], val = 3,
   * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
   * 你不需要考虑数组中超出新长度后面的元素。
   * 来源：力扣（LeetCode）
   * 链接：https://leetcode-cn.com/problems/remove-element
   * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   */
  public int removeElement(int[] nums, int val) {
    int lastIndex = nums.length-1;
    int i = 0;
    while(i <= lastIndex){
      if(nums[i] == val){
        swap(nums,i,lastIndex);
        lastIndex --;
      }
      else {
        ++i;
      }
    }
    return i;
  }
  private void swap(int[] arr ,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
      int[] arr = {3,2,2,3};
    System.out.println(new RemoveElement_27().removeElement(arr,3));
  }
}
