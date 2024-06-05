class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        
        int totaldays = 0;
        
        for(int i=0; i < a; i++) {
            totaldays += months[i];
        }
        
        totaldays += b;

        answer = days[(totaldays + 4) % 7];
        return answer;
    }
}
