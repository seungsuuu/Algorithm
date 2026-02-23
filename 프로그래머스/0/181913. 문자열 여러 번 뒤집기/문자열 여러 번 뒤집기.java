class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for(int[] query : queries) {
            int startIdx = query[0];
            int endIdx = query[1];
            
            answer = answer.substring(0, startIdx)
                + new StringBuilder(answer.substring(startIdx, endIdx + 1)).reverse().toString()
                + answer.substring(endIdx + 1);
        }
        
        return answer;
    }
}