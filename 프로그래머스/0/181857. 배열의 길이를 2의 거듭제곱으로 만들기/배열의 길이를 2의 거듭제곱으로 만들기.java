class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int twoSquare = 1;
        
        while(!(length <= twoSquare)) {
            twoSquare *= 2; 
        }
        
        int[] answer = new int[twoSquare];
        for(int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}