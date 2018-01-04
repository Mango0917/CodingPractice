/*
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int len=moves.length();
        if(len%2!=0) return false;
        
        int cntR=0, cntL=0, cntU=0, cntD=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='L'){
                cntL++;
            }
            else if(c=='R'){
                cntR++;
                
            }
            else if(c=='U'){
                cntU++;
            }
            else if(c=='D'){
                cntD++;
            }
        }
        if(cntL==cntR && cntU==cntD){
            return true;
        }
        else{
            return false;
        }
    }
}