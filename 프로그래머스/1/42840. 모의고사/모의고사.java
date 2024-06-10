import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        int[] score = {0,0,0};
        
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%5]) score[0]++;
            if(answers[i] == two[i%8]) score[1]++;
            if(answers[i] == three[i%10]) score[2]++;
        }
        
        int scoreMax = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int j = 0; j < score.length; j++) {
            if(scoreMax == score[j]) answerList.add(j+1);
        }
        
        int[] answer = new int[answerList.size()];
        for(int k = 0; k < answerList.size(); k++){
            answer[k] = answerList.get(k);
        }
        
        return answer;
    }
}