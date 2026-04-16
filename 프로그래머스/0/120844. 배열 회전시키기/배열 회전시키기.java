class Solution {
    public int[] solution(int[] numbers, String direction) {
        int length = numbers.length;
        int[] answer = new int[length];
        int temp = 0;
        
        if(direction.equals("right")) {
            temp = numbers[length - 1];
            for(int i = 0; i < length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = temp;
        } else if(direction.equals("left")) {
            temp = numbers[0];
            for(int i = 0; i < length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[length - 1] = temp;
        }
        
        return answer;
    }
}