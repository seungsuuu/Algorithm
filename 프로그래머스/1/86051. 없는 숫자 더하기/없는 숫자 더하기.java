class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        
        for (int i = 0; i < numbers.length; i++) {
            sum -= numbers[i];
        }
        answer = sum;

        return answer;
    }
}