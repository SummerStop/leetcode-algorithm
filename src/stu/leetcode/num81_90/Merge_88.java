package stu.leetcode.num81_90;

/**
 * @Author: ls
 * @Date: 2020/8/16 16:59
 */
public class Merge_88 {

  /**
   * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
   */
  // 0ms
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    if (nums2 == null || nums2.length == 0) {
      return;
    }
    int[] arr = new int[m + n];
    int mi = 0, ni = 0, i = 0;
    while (mi < m && ni < n) {
      if (nums1[mi] <= nums2[ni]) {
        arr[i++] = nums1[mi++];
      } else {
        arr[i++] = nums2[ni++];
      }
    }
    while (mi < m) {
      arr[i++] = nums1[mi++];
    }
    while (ni < n) {
      arr[i++] = nums2[ni++];
    }
    for(int j = 0;j < m+n;j ++){
      nums1[j] = arr[j];
    }
  }

}
