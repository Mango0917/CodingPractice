/*
Given an integer, write a function to determine if it is a power of two.
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
       return n>0 && (n==1 || (n%2==0 && isPowerOfTwo(n/2)));
    }
}