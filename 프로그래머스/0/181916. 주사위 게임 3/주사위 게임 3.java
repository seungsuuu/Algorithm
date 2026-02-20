import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);
        
        if(arr[0] == arr[3]) { //주사위 4개가 같을 때
            answer = 1111 * arr[0];
        } else if(arr[0] == arr[2]) { // 주사위 3개만 같을 때
            answer = (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
        } else if(arr[1] == arr[3]) {
            answer = (10 * arr[1] + arr[0]) * (10 * arr[1] + arr[0]);
        } else if(arr[0] == arr[1] && arr[2] == arr[3]) { // 주사위 2개씩 같을 때
            answer = (arr[2] + arr[0]) * (arr[2] - arr[0]);
        } else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) { // 주사위 2개가 같고, 나머지 다를 때
            if(arr[0] == arr[1]) {
                answer = arr[2] * arr[3];
            } else if(arr[1] == arr[2]) {
                answer = arr[0] * arr[3];
            } else {
                answer = arr[0] * arr[1];
            }
        } else { // 주사위 모두 다를 때
            answer =  arr[0];
        }
        
        return answer;
    }
}