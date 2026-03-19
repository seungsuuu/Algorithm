import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr) {
            list.add(num);
        }
        
        for(int i = 0; i < delete_list.length; i++) {
            int idx = list.indexOf(delete_list[i]);
            if(idx != -1) {
                list.remove(idx);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}