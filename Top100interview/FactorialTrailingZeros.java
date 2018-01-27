/*
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
*/
class Solution {
    public int trailingZeroes(int n) {
        int r=0;
        while(n>0){
            n=n/5;
            r=r+n;
        }
        return r;
    }
}