class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] charArr = myString.toCharArray();

        for(char c : charArr) {
            if('l' > c) {
                c = 'l';
            }
            answer += c;
        }
        
        return answer;
    }
}