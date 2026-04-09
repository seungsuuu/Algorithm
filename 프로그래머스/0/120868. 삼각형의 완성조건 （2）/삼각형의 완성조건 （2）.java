class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide;
        int shortSide;
        int otherShortSide;
        
        if(sides[1] > sides[0]) {
            longSide = sides[1];
            shortSide = sides[0];
        } else {
            longSide = sides[0];
            shortSide = sides[1];
        }
        
        otherShortSide = longSide;
        while(shortSide + otherShortSide > longSide) {
            answer++;
            otherShortSide--;
        }
        
        if(sides[1] > sides[0]) {
            shortSide = sides[1];
            otherShortSide = sides[0];
        } else {
            shortSide = sides[0];
            otherShortSide = sides[1];
        }
        
        longSide = shortSide + 1;
        while(shortSide + otherShortSide > longSide) {
            answer++;
            longSide++;
        }
 
        return answer;
    }
}