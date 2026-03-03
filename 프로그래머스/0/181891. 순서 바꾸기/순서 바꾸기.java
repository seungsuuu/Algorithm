class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        int idx = 0;
        
        for(int i = 0; i < length - n; i++) {
            answer[idx] = num_list[i + n];
            idx++;
        }
        
        for(int i = 0; i < n; i++) {
            answer[idx] = num_list[i];
            idx++;
        }
        
        return answer;
    }
}