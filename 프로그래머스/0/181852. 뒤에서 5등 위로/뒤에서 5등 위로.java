import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        Arrays.sort(num_list);
        int[] answer = new int[length - 5];
        int idx = 0;
        for(int i = 5; i < length; i++) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}