class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int length = arr.length;
        int count = 0;
        
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(arr[i][j] == arr[j][i]) {
                    count++;
                }
            }
        }
        
        answer = (count == length * length) ? 1 : 0; 
        
        return answer;
    }
}