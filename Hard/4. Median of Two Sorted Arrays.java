// Problem : Median of Two Sorted Arrays
// Link : https://leetcode.com/problems/median-of-two-sorted-arrays/
// Difficulty : Hard

import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[i + nums1.length] = nums2[i];
        }
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 != 0) {
            return arr[n / 2];  
        } else {
            return (arr[n / 2] + arr[(n / 2) - 1]) / 2.0;  
        }
    }
}
