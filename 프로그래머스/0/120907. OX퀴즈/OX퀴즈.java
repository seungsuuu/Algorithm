class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int idx = 0;
        
        for(String s : quiz) {
            String[] strArr = s.split(" ");
            int x = Integer.parseInt(strArr[0]);
            int y = Integer.parseInt(strArr[2]);
            int z = Integer.parseInt(strArr[4]);

            if(strArr[1].equals("+")){
                if(x + y == z) {
                    answer[idx] = "O";
                } else {
                    answer[idx] = "X";
                }
            } else if(strArr[1].equals("-")) {
                if(x - y == z) {
                    answer[idx] = "O";
                } else {
                    answer[idx] = "X";
                }
            }
            idx++;
        }

        return answer;
    }
}