// Problem: Remove Duplicated from a sorted array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=array
// Difficulty: Easy
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
