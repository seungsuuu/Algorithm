import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));
            if(num > k) arr.add(num);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).intValue();
        }
        
        return answer;
    }
}