import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];
        int idx = 0;
        for (int i = 0; i<arr.length; i++) {
            if(arr[i]%divisor == 0){
                temp[i] = arr[i];
                idx++;
            }
        }
        
        if(idx != 0) {
            int count = 0;
            for(int a : temp){
                if(a != 0){
                count++;
                } 
            }
        
            int[] answer = new int[count];
        
            int j = 0;
            for(int a : temp){
                if(a != 0){
                    answer[j] = a;
                    j++;
                }
            }
        Arrays.sort(answer);
        return answer;
        } else {
            int[] answerExp = {-1};
            return answerExp;
        }
    }
}