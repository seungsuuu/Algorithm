import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String my_string) {
        boolean flag = true;
        
        ArrayList<String> arr = new ArrayList<>();
        arr.add(my_string);
        
        for(int i = 1; i < my_string.length(); i++) {
            arr.add(my_string.substring(i));
        }
        Collections.sort(arr);
        
        String[] answer =  arr.toArray(new String[arr.size()]);
        return answer;
    }
}