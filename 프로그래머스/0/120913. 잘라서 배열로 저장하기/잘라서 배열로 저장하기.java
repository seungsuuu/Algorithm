class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int count = (length % n == 0)? length / n : (length / n) + 1;
        String[] answer = new String[count];
        int startIdx = 0;
        int endIdx = n;
        
        for(int i = 0; i < count; i++) {
            answer[i] = my_str.substring(startIdx, endIdx);
            startIdx += n;
            endIdx += n;
            if(endIdx > length) endIdx = length;
        }
        
        return answer;
    }
}