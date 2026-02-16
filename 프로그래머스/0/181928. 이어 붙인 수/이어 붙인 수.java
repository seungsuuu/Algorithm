class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNum = "";
        String evenNum = "";
        
        for(int num : num_list) {
            if(num % 2 == 1) { //홀수
                oddNum += num;
            } else if(num % 2 == 0) { //짝수
                evenNum += num;
            }
        }
        
        answer = Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
        
        return answer;
    }
}