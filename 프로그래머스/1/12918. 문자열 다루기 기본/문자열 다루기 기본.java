class Solution {
    public boolean solution(String s) {
        boolean answer= true;
        int size = s.length();
        String[] sArr = s.split("");
        int count = 0;
        
        if(size == 4 || size == 6){
            for(int i = 0; i < size; i++){
                for(int j = 0; j < 10; j++){
                    String jStr = j+"";
                    if(sArr[i].equals(jStr)){
                        count++;
                    } 
                }
            }
           
            if(count == size){
                answer= true;
            } else {
                 answer= false;
            }

        } else {
            answer = false;
        }

        return answer;
    }
}