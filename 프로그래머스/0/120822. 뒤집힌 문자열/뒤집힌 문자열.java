class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] strArr = my_string.split("");
        int length = strArr.length;
        
        for(int i = length - 1; i >= 0; i--) {
            answer += strArr[i];
        }
        
        return answer;
    }
}