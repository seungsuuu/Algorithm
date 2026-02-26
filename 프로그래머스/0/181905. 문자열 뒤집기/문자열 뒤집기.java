class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        answer += my_string.substring(0, s);
        
        String tempStr = my_string.substring(s, e + 1);
        for(int i = tempStr.length() - 1; i >= 0; i--) {
            answer += tempStr.charAt(i);
        }
        
        answer += my_string.substring(e + 1);
        
        return answer;
    }
}