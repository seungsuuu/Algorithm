class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] strArr = myString.split("");
        String tempStr = "";
        
        for(String s : strArr) {
            if(s.equals("A")) {
                s = "B";
            } else if(s.equals("B")) {
                s = "A";
            }
            tempStr += s;
        }
        
        if(tempStr.contains(pat)) answer = 1;
        
        return answer;
    }
}