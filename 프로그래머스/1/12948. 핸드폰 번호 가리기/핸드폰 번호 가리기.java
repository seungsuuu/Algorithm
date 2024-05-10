import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int size = phone_number.length();
        char[] phoneNumberArr = new  char[size];
        phoneNumberArr = phone_number.toCharArray();
        
        for(int i=0; size-i > 4; i++){
            phoneNumberArr[i] = '*';
        }
        
        answer = String.valueOf(phoneNumberArr);
        
        return answer;
    }
}