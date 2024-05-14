import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int size = a.length;
        int[] multi = new  int[size];
        
        for(int i = 0; i<size; i++) {
            multi[i] = a[i]*b[i];
        }

        answer = Arrays.stream(multi).sum();

        return answer;
    }
}