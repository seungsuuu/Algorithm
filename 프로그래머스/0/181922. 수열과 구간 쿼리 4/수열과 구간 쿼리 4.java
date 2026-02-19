class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int[] temp = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++) {
            int[] query = queries[i];

            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for(int j = s; j <= e; j++) {
                if(j % k == 0) {
                    temp[j] += 1;
                }
            }
        }
        
        for(int i = 0; i < temp.length ; i++) {
            answer[i] = arr[i] + temp[i];
        }
        
        return answer;
    }
}