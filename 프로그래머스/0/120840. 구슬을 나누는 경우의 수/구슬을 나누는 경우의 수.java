import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        
        if(balls == share || share == 0) return 1;
        
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        
        for(int i = balls; i > 0; i--) {
            BigInteger j = new BigInteger(Integer.toString(i));
            a = a.multiply(j);
        }
        for(int i = balls - share; i > 0; i--) {
            BigInteger j = new BigInteger(Integer.toString(i));
            b = b.multiply(j);
        }
        for(int i = share; i > 0; i--) {
            BigInteger j = new BigInteger(Integer.toString(i));
            b = b.multiply(j);
        }
        
        answer = (a.divide(b.multiply(c))).intValue();
    
        return answer;
    }
}