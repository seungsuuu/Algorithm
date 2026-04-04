import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeArr = before.split("");
        String[] afterArr = after.split("");
        int count = 0;
        
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        
        for(int i = 0; i < beforeArr.length; i++) {
            if(beforeArr[i].equals(afterArr[i])) {
                count++;
            }
        }
        
        if(count == beforeArr.length) {
            answer = 1;
        }
        
        return answer;
    }
}