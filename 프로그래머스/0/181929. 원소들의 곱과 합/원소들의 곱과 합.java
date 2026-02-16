class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sumSquare = 0;
        int multiple = 1;
        
        for(int num : num_list) {
            multiple *= num;
            sumSquare += num;
        }
        
        if(multiple < sumSquare*sumSquare) {
            answer = 1;
        }
        
        return answer;
    }
}