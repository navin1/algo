package leetcode;

public class MedianofTwoSortedArrays {
  public static void main(String[] args) {
    MedianofTwoSortedArrays obj = new MedianofTwoSortedArrays();
    int nums1[] = {2, 5};
    int nums2[] = {1, 4, 6, 7};
    double res = obj.findMedianSortedArrays(nums1, nums2);
    System.out.println(res);
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int l1 = nums1.length;
    int l2 = nums2.length;
    int len = l1 + l2;
    int i = 0, j = 0;
    double median = 0, median_1 = 0, median_2 = 0;
    while (i <= l1 && j <= l2 && i + j <= len / 2) {
      if (i < l1 && j < l2)
        median_1 = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
      else if (i == l1 && j < l2)
        median_1 = nums2[j++];
      else if (j == l2 && i < l1)
        median_1 = nums1[i++];

      if (len % 2 == 1)
        median = median_1;
      else
        median = (median_1 + median_2) / 2;
      median_2 = median_1;
    }
    return median;
  }
}
