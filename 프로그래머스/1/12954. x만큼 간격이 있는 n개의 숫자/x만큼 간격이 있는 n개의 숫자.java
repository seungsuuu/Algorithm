import java.util.ArrayList;
class Solution {
    public long[] solution(int x, int n) {
        int idx = n;
        long[] answer = new long[idx];
        
        for(int i = 1; i<= n ; i++){
            answer[i-1] = (long)x*i;
        }
        return answer;
    }
}