import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int min = Arrays.stream(arr).min().getAsInt();
        
        if(min == arr[0] && arr.length == 1){
            answer = new int[] {-1};
        } else {
           answer  = Arrays.stream(arr).filter(i -> i != min).toArray();
        }
        
        return answer;
    }
}