import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int tSize = t.length();
        int pSize = p.length();
        int subStrCount = tSize - pSize + 1;
        String[] strArr = new String[subStrCount];
            
        for(int i=0; i < subStrCount; i++){
            strArr[i] = t.substring(i,pSize+i);
        }
        
        for (String s : strArr){
            Long sLong = Long.parseLong(s);
            Long pLong = Long.parseLong(p);
            if(sLong <= pLong){
                answer++;
            }
        }

        return answer;
    }
}