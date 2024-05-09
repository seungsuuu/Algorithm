import java.util.*;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        int[] temp = new int[absolutes.length];
        
        for (int i = 0; i<absolutes.length; i++) {
            if(!signs[i]){
               temp[i] = absolutes[i] * -1;
            } else {
                temp[i] = absolutes[i];
            }
        }
        
        answer = Arrays.stream(temp).sum();
        
        return answer;
    }
}