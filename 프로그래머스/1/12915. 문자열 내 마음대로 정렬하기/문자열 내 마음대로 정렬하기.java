import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] strArr  = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++) {
            strArr[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(strArr);
        
        for(int j = 0; j < strings.length; j++) {
            answer[j] = strArr[j].substring(1);
        }
        
        return answer;
    }
}