class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a > b){
            for(int i = 0;i <= a-b;i++) {
                answer += a - i;
            }     
        } else if(a < b){
            for(int i = 0;i <= b-a;i++) {
                answer += b - i;
            }
        } else if(a == b){
            answer = a;
        }
        return answer;
    }
}