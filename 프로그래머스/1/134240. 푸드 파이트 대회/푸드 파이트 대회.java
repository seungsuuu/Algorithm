import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        int water = 0;
        
        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 1){
                food[i] -= 1;
            }
            for(int j = 0; j < food[i]/2; j++) {
                list.add(i);
            }
        }
        
         list.add(water);
        
        for(int k = food.length-1; k > 0; k--) {
            for(int l = 0; l < food[k]/2; l++) {
                list.add(k);
            }
        }
        
        for(int n : list){
            answer += n;
        }
        
        return answer;
    }
}