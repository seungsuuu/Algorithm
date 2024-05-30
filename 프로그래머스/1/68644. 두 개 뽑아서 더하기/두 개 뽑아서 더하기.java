import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> sum = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length;j++){
                int temp = numbers[i]+numbers[j];
                sum.add(temp);
            }
        }
        
        Object[] tempArr = sum.stream().distinct().sorted().toArray();
        
        int[] answer = new int[tempArr.length];
        
        for(int k = 0; k < tempArr.length; k++){
            answer[k] = (Integer)tempArr[k];
        }
        
        return answer;
    }
}