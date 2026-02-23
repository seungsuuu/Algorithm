class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] numberSplit = number.split("");
        
        for(String s : numberSplit) {
            answer += Integer.parseInt(s); 
        }
        
        answer %= 9;
        
        return answer;
    }
}