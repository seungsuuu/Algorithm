import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                list.add(i);
            }
        }
        
        int listSize = list.size();
        if(listSize < 1) {
             return new int[] {-1};
        } else if(listSize == 1) {
             return new int[] {arr[list.get(0)]};
        } else {
            int minIdx = list.get(0);
            int maxIdx = list.get(list.size() - 1);
            int length = maxIdx - minIdx + 1;
            int[] answer = new int[length];
            int idx = 0;
            for(int i = minIdx; i <= maxIdx; i++) {
                answer[idx] = arr[i];
                idx++;
            }
            return answer;
        }
    }
}