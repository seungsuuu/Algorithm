class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        
        if(x == (int)x) {
            x += 1;
            answer = (long)(x*x);
        } else{
            answer = -1;
        }
       
        
    
        
        return answer;
    }
}