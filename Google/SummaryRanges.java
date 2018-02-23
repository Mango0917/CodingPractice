/*
Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:
Input: [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Example 2:
Input: [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        if(nums.length==1){
            ans.add(String.valueOf(nums[0]));
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while((i+1!=nums.length) && nums[i+1]-nums[i]==1 ){
                i++;
            }
            if(a!=nums[i]){
                ans.add(a+"->"+nums[i]);
            }
            else{
                ans.add(String.valueOf(a));
            }
        }
        return ans;
    }
}