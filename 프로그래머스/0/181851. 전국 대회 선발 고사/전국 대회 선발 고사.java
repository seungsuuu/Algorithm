import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] pick = new int[3];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i]) list.add(rank[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < rank.length; j++) {
                if(list.get(i) == rank[j]) {
                    pick[i] = j;
                }
            }
        }
        
        answer = 10000 * pick[0] + 100 * pick[1] + pick[2];
        
        return answer;
    }
}