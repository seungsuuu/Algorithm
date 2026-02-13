class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ab = Integer.parseInt(a + "" + b);
        int ba = 2 * a * b;
        
        answer = (ab >= ba) ? ab : ba;
        
        return answer;
    }
}