/*
Given a collection of intervals, merge all overlapping intervals.

For example,
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
*/
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        Stack<Interval> stack=new Stack();
        Collections.sort(intervals,(a,b)->a.start-b.start);
        for(Interval it:intervals){
            if(stack.isEmpty()|| it.start>stack.peek().end) stack.push(it);
            else{
                stack.peek().end=Math.max(it.end,stack.peek().end);   
            }
        }
        return new ArrayList(stack);
    }
}