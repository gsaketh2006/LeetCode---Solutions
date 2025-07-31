 // Problem: Reverse Integer
 // Link : https://leetcode.com/problems/reverse-integer/
 // Difficulty : Medium
class Solution {
    public int reverse(int x) {
        int digit,dup=x;
        long reverse=0;
        x = Math.abs(x);
        while(x>0){
            digit = x%10;
            reverse = reverse*10+digit;
            x = x/10;
        }
        if(dup<0){
            reverse = -reverse;
        }
        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }else{
            return (int)reverse;
        }
        
    }
}
