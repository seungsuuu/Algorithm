class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int count = 0;
        
        for(boolean flug : included) {
            if(flug) {
                answer += a + count*d;
            }
            count++;
        }
        
        return answer;
    }
}