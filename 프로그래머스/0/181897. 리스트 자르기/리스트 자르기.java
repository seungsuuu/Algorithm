import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> intArr = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        switch (n) {
            case 1: 
                for(int i = 0; i <= b; i++) {
                    intArr.add(num_list[i]);
                }
                break;
            case 2:
                for(int i = a; i < num_list.length; i++) {
                    intArr.add(num_list[i]);
                }
                break;
            case 3:
                for(int i = a; i <= b; i++) {
                    intArr.add(num_list[i]);
                }
                break;
            case 4:
                for(int i = a; i <= b; i += c) {
                    intArr.add(num_list[i]);
                }
        }

        int[] answer = new int[intArr.size()];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = intArr.get(i);
        }
        
        return answer;
    }
}