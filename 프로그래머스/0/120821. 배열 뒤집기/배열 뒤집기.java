class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        int idx = 0;
        
        for(int i = length - 1; i >= 0; i--) {
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}