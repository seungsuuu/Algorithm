import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for(int i = k; i <= n; i += k) {
            intArr.add(i);
        }
        
        int[] answer = new int[intArr.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = intArr.get(i);
        }
        
        return answer;
    }
}