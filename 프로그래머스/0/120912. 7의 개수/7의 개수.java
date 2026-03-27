class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int num : array) {
            String s = "" + num;
            char[] arr = s.toCharArray();
            for(char c : arr) {
                if(c == '7') answer++;
            }
        }
        
        return answer;
    }
}