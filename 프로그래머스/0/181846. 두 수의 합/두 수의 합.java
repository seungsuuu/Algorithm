import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aInt = new BigInteger(a);
        BigInteger bInt = new BigInteger(b);
        answer += aInt.add(bInt);
        return answer;
    }
}