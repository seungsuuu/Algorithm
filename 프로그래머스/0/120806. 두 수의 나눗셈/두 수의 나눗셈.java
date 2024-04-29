class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double num1ToDou = (double)num1;
        double num2ToDou = (double)num2;
        
        double douAnswer = num1ToDou / num2ToDou;
        answer = (int)(douAnswer*1000);
        return answer;
    }
}