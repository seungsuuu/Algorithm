class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        for(int i = 0; i < indices.length; i++) {
           strArr[indices[i]] = "";
        }
        
        answer = String.join("", strArr);
        
        return answer;
    }
}