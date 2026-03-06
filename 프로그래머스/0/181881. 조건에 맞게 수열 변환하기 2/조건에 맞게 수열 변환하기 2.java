import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        int x = 0;
        boolean flag = true;
        
        while(flag) {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 ==0) {
                    temp[i] = arr[i] / 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    temp[i] = (arr[i] * 2) + 1;
                } else {
                    temp[i] = arr[i];
                }
            }
            
            if(Arrays.equals(temp, arr)) {
                answer = x;
                flag = false;
            } else {
                arr = temp.clone();
                x++;
            }
        }

        return answer;
    }
}