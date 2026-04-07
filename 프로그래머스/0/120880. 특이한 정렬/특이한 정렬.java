import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = numlist.clone();
        Arrays.sort(answer);
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer.length; j++){
                if(Math.abs(answer[i]-n) <= Math.abs(answer[j]-n)){
                    int temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        
        return answer;
    }
}