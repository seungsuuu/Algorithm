import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> notFinishedTodoList = new ArrayList<>();
        
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]){
                notFinishedTodoList.add(todo_list[i]);
            }
        }
        
        String[] answer = notFinishedTodoList.toArray(new String[notFinishedTodoList.size()]);
        return answer;
    }
}