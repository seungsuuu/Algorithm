class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numToStr = "" + num;
        String kToStr = "" + k;
        String[] arr = numToStr.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(kToStr)) {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}