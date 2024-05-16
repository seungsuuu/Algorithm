import java.util.*;

class Solution {
    public String solution(String s) {
         String answer = "";
        
        String[] stringArr = s.split("");
        Arrays.sort(stringArr, Collections.reverseOrder());
       
        for(int i = 0; i < stringArr.length; i++)
        {
            answer += stringArr[i];
        }
       
        return answer;
    }
}