class Solution {
    public int solution(int order) {
        int answer = 0;
        String s = "" + order;
        
        for(int i = 0; i < s.length(); i++) {
            String slice = s.substring(i, i + 1);
            if(slice.equals("3") || slice.equals("6") || slice.equals("9")){
                answer += 1;
            }
        }
        
        return answer;
    }
}