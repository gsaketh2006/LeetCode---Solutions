// Problem: Length of the last word
// Link: https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        char[] arr = s.trim().toCharArray();
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==' '){
                break;
            }else{
                count++;
            }
        }
        return count;
        
    }
}
