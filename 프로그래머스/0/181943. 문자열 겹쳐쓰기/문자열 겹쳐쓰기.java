class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int myStringLength = my_string.length();
        int overWriteStringLength = overwrite_string.length();
        
        answer = my_string.substring(0, s) + overwrite_string;
        
        if(answer.length() < myStringLength) {
            answer += my_string.substring(s+overWriteStringLength);
        }
        
        return answer;
    }
}