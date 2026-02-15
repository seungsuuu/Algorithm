class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if(mode == 0) {
                if(c == '1') {
                    mode = 1;
                    continue;
                } else {
                    answer += (i % 2 == 0) ? c : "";
                }
            } else if(mode == 1) {
                if(c == '1') {
                    mode = 0;
                } else {
                    answer += (i % 2 == 1) ? c : "";
                }
            }
        }
        
        if(answer.length() < 1) {
            answer += "EMPTY";
        }

        return answer;
    }
}