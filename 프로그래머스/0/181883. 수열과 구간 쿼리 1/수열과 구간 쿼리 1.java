class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            for(;s <= e;s++) {
                arr[s] += 1; 
            }
        }
        
        return arr;
    }
}