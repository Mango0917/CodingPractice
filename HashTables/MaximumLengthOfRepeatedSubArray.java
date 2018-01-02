/*
Given two integer arrays A and B, return the maximum length of an subarray that appears in both arrays.

Example 1:

Input:
A: [1,2,3,2,1]
B: [3,2,1,4,7]
Output: 3
Explanation: 
The repeated subarray with maximum length is [3, 2, 1].

*/
class Solution {
    public int findLength(int[] A, int[] B) {
       int n=A.length;
        int m=B.length;
        if(n==0||m==0) return 0;
        int[][] dp=new int[m+1][n+1];
        int max=0;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                max=Math.max(max,dp[i][j]=A[i]==B[j]?1+dp[i+1][j+1]:0);
            }
        }
        return max;
    }
}