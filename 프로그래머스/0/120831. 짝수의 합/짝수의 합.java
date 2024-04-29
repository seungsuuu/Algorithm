class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        if ((n%2) == 1) {
            n--;
        }
        
        while(!(n == 0)) {
                 count = count + n;
                 n = n - 2;
        }
        
        answer = count;
        
        return answer;
    }
}