/*
Given a roman numeral, convert it to an integer.


*/
/*
    I=1
    V=5
    X=10
    L=50
    C=100
    D=500
    M=1000
    
*/


class Solution {
    public int romanToInt(String s) {
        
        int[] nums=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                nums[i]=1;
            }
            else if(s.charAt(i)=='V'){
                nums[i]=5;
            }
            else if(s.charAt(i)=='X'){
                nums[i]=10;
            }
            else if(s.charAt(i)=='L'){
                nums[i]=50;
            }
            else if(s.charAt(i)=='C'){
                nums[i]=100;
            }
            else if(s.charAt(i)=='D'){
                nums[i]=500;
            }
            else if(s.charAt(i)=='M'){
                nums[i]=1000;
            }
        }
        int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1]){
            sum-=nums[i];
        }
        else
            sum+=nums[i];
    }
        return sum+nums[nums.length-1];
    }
}