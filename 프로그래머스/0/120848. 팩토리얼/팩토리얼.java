class Solution {
    public int solution(int n) {
        int answer = 0;
        int factorial = 1;
        int idx = 1;
        boolean flag = true;
        
        while(flag) {
            factorial *= idx;
            
            if(factorial == n) {
                answer = idx;
                break;
            } else if(n < factorial) {
                answer = idx - 1;
                break;
            }
            idx++;
        }
        
        return answer;
    }
}