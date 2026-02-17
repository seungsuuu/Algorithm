class Solution {
    public int[] solution(int[] num_list) {
        int numListLength = num_list.length;
        int numPlus;
        
        if(num_list[numListLength - 1] > num_list[numListLength - 2]) {
            numPlus = num_list[numListLength - 1] - num_list[numListLength - 2];
        } else {
            numPlus = num_list[numListLength - 1] * 2;
        }
        
        int[] answer = new int[numListLength + 1];
        
        for(int i = 0; i < answer.length; i++) {
            if(i < numListLength) {
                answer[i] = num_list[i];
            } else {
                answer[i] = numPlus;
            }
        }
        
        return answer;
    }
}