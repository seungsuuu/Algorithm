class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xStr = x + "";
        int idx = xStr.length();
        int count = 0;
        int h = x;
        for (int i = 0;i < idx;i++){
            count += h%10;
            h = h/10;
        }
        if(x%count == 0){
            answer = true;
        } else {
            answer = false;
        }
       
        
        
        return answer;
    }
}