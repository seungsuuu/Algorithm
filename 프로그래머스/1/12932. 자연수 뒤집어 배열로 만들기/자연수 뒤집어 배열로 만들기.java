class Solution {
    public int[] solution(long n) {
        int num = numberCheck(n);
        int[] answer = new int[num];
        for(int i = 0; i < num; i++){
            answer[i] = (int)(n%10L);
            n = n/10;
        }
        return answer;
    }
    
    public int numberCheck(long n) {
        boolean numCheck = true;
        int count = 0;
        while(numCheck) {
            n = n/10;
            count++;
            if(n == 0) {
                numCheck = false;
            }
        }
       return count;
    }
        
}