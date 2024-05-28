class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] StrArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < StrArr.length; i++) {
            if(s.contains(StrArr[i])) {
                s = s.replace(StrArr[i], Integer.toString(i));
            }
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}