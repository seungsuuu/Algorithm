class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        while(true) {
            if(A.equals(B)) {
                break;
            } else {
                answer++;
            }
            
            String s = "";
            char[] arr = A.toCharArray();
            int length = arr.length;
            s += arr[length - 1];
            
            for(int i = 0; i < length - 1; i++) {
                s += arr[i];
            }
            
            A = s;
            
            if(answer > length) {
                answer = -1;
                break;
            }   
        }
        
        return answer;
    }
}