class Solution {
    public String solution(int n) {
        String answer = "";
        char[] letter = {'수', '박'};
        
        for(int i = 0; i < n; i++){
            answer += letter[i%2];
        
        }

        return answer;
    }
}