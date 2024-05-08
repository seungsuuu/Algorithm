class Solution {
    public int solution(int num) {
        int answer = 0;
        int count = 1;
        boolean flag = true;
        if (num == 1){
            answer = 0;
            flag = false;
        }
        
        while(flag) {
            if(num%2 == 0){
                num = num / 2;
            } else if (num%2 == 1) {
                num = (num * 3) + 1;
            }
            
            if(num == 1){
                flag = false;
                answer = count;
            }
            
            if(count >= 500){
                flag = false;
                answer = -1;
            }
            count++;
        }
        return answer;
    }
}