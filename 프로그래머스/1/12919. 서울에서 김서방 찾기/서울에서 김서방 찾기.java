import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        String x = "";
        
        for(int i = 0;i < seoul.length;i++) {
            if(seoul[i].equals("Kim")) {
                x = i+"";
            }
        }
        
        answer = "김서방은 "+ x + "에 있다";
        return answer;
    }
}