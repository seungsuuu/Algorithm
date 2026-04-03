import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] arr = new int[array.length];
        
        for(int i = 0; i < array.length; i++) {
            arr[i] = Math.abs(array[i] - n);
        }
        
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                list.add(array[i]);
            }
        }
        
        if(list.size() == 1) {
            answer = list.get(0);
        } else {
            for(int i = 0; i < list.size() - 1; i++) {
                answer = Math.min(list.get(i), list.get(i + 1));
            }
        }
        
        return answer;
    }
}