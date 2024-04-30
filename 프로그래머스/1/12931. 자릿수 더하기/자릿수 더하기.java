public class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean check = true;
        
        while(check) {
            answer += n%10;
            n = (n - (n%10))/10;
            
            if(n == 0) {
                check = false;
            }
        }
        return answer;
    }
}