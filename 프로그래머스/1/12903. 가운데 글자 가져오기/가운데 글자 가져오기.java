import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        int size = s.length();
        if(size % 2 == 1) {
            answer = s.substring((int)(size/2), (int)(size/2+1));
         
        } else if(size % 2 == 0) {
            answer = s.substring((int)(size/2-1), (int)(size/2+1));
            
        }

        return answer;
    }
}