class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int size = sizes.length;
        int max_w = 0;
        int max_h = 0;
        
        for (int i = 0; i < size; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for(int j = 0; j < size; j++) {
            if(max_w < sizes[j][0]){
                max_w = sizes[j][0];
            }
            if(max_h < sizes[j][1]){
                max_h = sizes[j][1];
            }
        }
        
        answer = max_w*max_h;

        return answer;
    }
}