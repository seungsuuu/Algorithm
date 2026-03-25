class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int midNum = total / num;
        int firstNum = 0;
        
        if(num % 2 == 0) {
            firstNum = midNum - (num / 2) + 1;
        } else {
            firstNum = midNum - (num / 2);
        }
            
        for(int i = 0; i < num; i++) {
            answer[i] = firstNum++;
        }
        
        return answer;
    }
}