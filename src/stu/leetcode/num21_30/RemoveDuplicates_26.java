package stu.leetcode.num21_30;

/**
 * @Author: ls
 * @Date: 2020/7/27 22:58
 */
public class RemoveDuplicates_26 {
  /**
   * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
   * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
   * 示例 1:
   * 给定数组 nums = [1,1,2],
   * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
   * 你不需要考虑数组中超出新长度后面的元素。
   * 来源：力扣（LeetCode）
   * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
   * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
   */
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 1) return nums.length;
    int i = 0;
    int j = i+1;
    while(j <= nums.length-1){
      if(nums[j] <= nums[i]){
        j ++;
      }
      else{
        i ++;
        swap(nums,i,j);
        j++;
      }
    }
    return i+1;
  }
  private void swap(int[] nums,int i,int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(new RemoveDuplicates_26().removeDuplicates(arr));
  }
}
