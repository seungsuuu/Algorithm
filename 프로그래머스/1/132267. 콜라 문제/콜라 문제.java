class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        boolean flag = true;
    
        while(flag) {
            answer += (n/a * b);
            n = (n/a) * b + (n%a);
            if(n < a) {
                flag = false;
            }
        }

        return answer;
    }
}