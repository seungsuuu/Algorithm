class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int[] numbers = new int[3];
        
        for(int i = 0; i < 3; i++) {
            numbers[i] = box[i] / n;
        }
        
        for(int i = 0; i < 3; i++) {
            answer *= numbers[i];
        }
        return answer;
    }
}