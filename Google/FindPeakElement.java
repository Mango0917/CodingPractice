/*
A peak element is an element that is greater than its neighbors.

Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that num[-1] = num[n] = -∞.

For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
O(log n)
*/
class Solution {
    public int findPeakElement(int[] nums) {
        int n=binarysearch(nums, 0, nums.length-1);
        return n;
    }
    public int binarysearch(int[] nums, int min, int max){
        if(min==max){
            return min;
        }
        int mid1=(min+max)/2;
        int mid2=mid1+1;
        if(nums[mid1]<nums[mid2]  ){
            return binarysearch(nums, mid2, max);
        }
        else{
            return binarysearch(nums, min, mid1);
        }
    }
}