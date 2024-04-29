class Solution {
    public int solution(int angle) {
        int answer = 0;
        answer = angleGroup(angle);
        return answer;
    }
    
    public int angleGroup(int angle) {
        int group = 0;
        if(angle>0 && angle<90) {
            group = 1;
        } else if(angle==90) {
            group = 2;
        } else if(angle>90 && angle<180) {
            group = 3;
        } else if(angle==180) {
            group = 4;
        }
         return group;
    }

}
    


