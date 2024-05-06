import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String temp = n + "";
        int idx = temp.length();
        long[] nums = new long[idx];
        
        for (int i = 0;i < idx ; i++) {
            long arrNum = n%10;
            n = n/10;
            nums[i] = arrNum;
        }
        
        Arrays.sort(nums);
        
        for (int j = 0; j < idx; j++) {
            answer += nums[j] * (long)Math.pow(10, j);
            
        }
        
        
        return answer;
    }
}