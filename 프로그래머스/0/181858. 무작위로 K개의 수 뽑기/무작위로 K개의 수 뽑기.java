import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++) {
            if(list.size() == k) break;
            if(!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        
        int size = list.size();
        if(size < k) {
            for(int i = 0; i < k - size; i++) {
                list.add(-1);
            }
        }
        
        int[] answer = new int[k];
        
        for(int i = 0; i < k; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}