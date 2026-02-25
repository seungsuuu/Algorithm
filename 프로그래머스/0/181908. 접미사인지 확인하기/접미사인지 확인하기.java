import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> strArr = new ArrayList<>();
        strArr.add(my_string);
        for(int i = 1; i < my_string.length(); i++) {
            strArr.add(my_string.substring(i));
        }
        
        if(strArr.contains(is_suffix)) answer = 1;
    
        return answer;
    }
}