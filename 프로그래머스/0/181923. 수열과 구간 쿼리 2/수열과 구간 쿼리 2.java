class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        
        for(int[] query : queries) {
            int temp = 0;
            for(int i = query[0]; i <= query[1]; i++) {
                if(arr[i] > query[2]) {
                    if(temp == 0 || temp > arr[i]) {
                        temp = arr[i];
                    }                  
                }
            }
            if(temp == 0) {
                answer[count] = -1;
            } else {
                answer[count] = temp;
            }
            count++;
        }
        
        return answer;
    }
}