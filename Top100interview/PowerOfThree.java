/*
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?
*/
class Solution {
    public boolean isPowerOfThree(int n) {
        
        int maxPow = (int)(Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3))));
       
        return n > 0 && (maxPow % n == 0);  //1162261467
    }
}