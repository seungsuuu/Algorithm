class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kToStr = String.valueOf(k);
        
        for(int l = i; l <= j; l++) {
            String lToStr = String.valueOf(l);
            if(lToStr.contains(kToStr)) {
                String[] arr = lToStr.split("");
                for(String s : arr) {
                    if(s.equals(kToStr)) {
                        answer++;
                    }
                }
            } 
        }
        
        return answer;
    }
}