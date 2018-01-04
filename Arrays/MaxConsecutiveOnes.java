/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                result=Math.max(result,count);
            }
            else count=0;
        }
        return result;
    }
}