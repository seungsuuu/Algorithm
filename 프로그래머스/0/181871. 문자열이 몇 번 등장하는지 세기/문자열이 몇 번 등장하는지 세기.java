class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int myStringLength = myString.length();
        int patLength = pat.length();
        
        for(int i = 0; i < myStringLength - patLength + 1; i++) {
            if(myString.substring(i, i + patLength).equals(pat)) {
                answer++;
            }
        }
        
        return answer;
    }
}