class Solution {
    public int solution(int[][] board) {
        int length = board.length;
        int[][] danger = new int[length][length];

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(board[i][j] == 1) {
                    int iMinus = Math.max(i - 1, 0);
                    int iPlus = Math.min(i + 1,length - 1);
                    int jMinus = Math.max(j - 1, 0);
                    int jPlus = Math.min(j + 1, length - 1);

                    danger[i][j] = 1;
                    danger[i][jMinus] = 1;
                    danger[i][jPlus] = 1;
                    danger[iPlus][jMinus] = 1;
                    danger[iPlus][j] = 1;
                    danger[iPlus][jPlus] = 1;
                    danger[iMinus][jMinus] = 1;
                    danger[iMinus][j] = 1;
                    danger[iMinus][jPlus] = 1;
                }
            }
        }

        int answer = 0;
         for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(danger[i][j]==0) answer++;
            }
         }

        return answer;
    }
}