// import java.until.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String sign = s.substring(0,1);
        String numStr = s.substring(1);
        
        if (sign.equals("-")) {
            answer = Integer.parseInt(numStr);
            answer *= -1;
        } else if(sign.equals("+")) {
            answer = Integer.parseInt(numStr);
        } else {
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}