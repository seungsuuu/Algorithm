import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean flag = true;
        List<Integer> temp = new ArrayList<>();
        
        while(n != 0) {
            temp.add(n%3);
            n = n/3;
            
        }
        
        int powNum = 0;
        for(int i = (temp.size()-1); i >= 0; i--){
            answer += (temp.get(i) * Math.pow(3, powNum));
            powNum++;
            
        }
        
        
        
        return answer;
    }
}