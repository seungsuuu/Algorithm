import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        boolean flag = true;
        
        while(flag) {
            arrayList.add(n);
            
            if(n == 1) flag = false;
            
            if(n % 2 == 0) { // n이 짝수
                n /= 2;
            } else { // n이 홀수
                n = 3 * n + 1;
            }
        }
        
        int[] answer = new int[arrayList.size()]; 
        
        int idx = 0;
        for(int num : arrayList) {
            answer[idx] = num;
            idx++;
        }
        
        return answer;
    }
}