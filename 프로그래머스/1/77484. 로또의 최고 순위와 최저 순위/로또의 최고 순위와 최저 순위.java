class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int winCount = 0;
        
        for(int i : lottos) {
                if(i == 0){
                    count++;
                }
        }
        
        for(int i : win_nums){
            for(int j : lottos) {
                if(i == j){
                    winCount++;
                }
            }
        }
        
        int maxCount = count + winCount;
        int minCount = winCount;
        
        answer[0] = this.rank(maxCount);
        answer[1] = this.rank(minCount);
        
        return answer;
    }
    
    private int rank(int count) {
        int rankNum = 0;
        switch(count) {
            case 6: 
                rankNum = 1;
                break;
            case 5: 
                rankNum = 2;
                break;
            case 4: 
                rankNum = 3;
                break;
            case 3: 
                rankNum = 4;
                break;
            case 2: 
                rankNum = 5;
                break;
            default :
                rankNum = 6;
                break;
        }
        return rankNum;
    }
}