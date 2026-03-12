import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for(String s : strArr) {
            if(!s.equals("")) {
                list.add(s);
            }
        }
        
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        Arrays.sort(answer);
        
        return answer;
    }
}