class Solution {
    public int[] solution(int[] arr, int k) {
        int length = arr.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++) {
            if(k % 2 != 0) {
                answer[i] = arr[i] * k;
            } else {
                answer[i] = arr[i] + k;
            }
        }
        
        return answer;
    }
}