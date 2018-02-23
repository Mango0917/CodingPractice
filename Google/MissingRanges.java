/*
Given a sorted integer array where the range of elements are in the inclusive range [lower, upper], return its missing ranges.

For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].
*/
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list=new ArrayList<String>();
        if(nums.length==0){
            if(lower==upper){
                list.add(Integer.toString(lower));
            }
            else{
                list.add(lower+"->"+upper);
            }
           return list;
        }
        for(int i=0;i<=nums.length;i++){
            int lt=i==0?lower:nums[i-1]+1;
            int gt=i==nums.length?upper:nums[i]-1;
            addRange(list,lt,gt);
        }
        return list;
    }
    private void addRange(List<String> list, int lt, int gt){
        if(lt>gt){
            return;
        }
        else if(lt==gt) list.add(Integer.toString(lt));
        else list.add(lt+"->"+gt);
    }
}