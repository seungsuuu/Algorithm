import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr) {
            list.add(a);
        }
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                list = list.subList(0, query[i] + 1);
            } else if(i % 2 == 1) {
                list = list.subList(query[i], list.size());
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}