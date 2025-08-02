// Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy

class Solution {
    public boolean isPalindrome(int x) {
        int digit,reversed=0,dup=x;
        while(x>0){
            digit = x%10;
            reversed = reversed*10+digit;
            x=x/10;
        }
        if(dup==reversed){
            return true;
        }else{
            return false;
        }
    }
}
