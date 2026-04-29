import java.util.*;

class Solution {
	public int solution(int[] array) {
		int answer = array[0];
        int length = array.length;
        int fr[] = new int[length];
		int max[] = new int[length];
		int j = 0;

		Arrays.sort(array);
		
		for (int i = 0; i < length - 1; i++) {
			if (array[i] == array[i + 1]) {
				fr[j]++;
				max[j] = array[i];
			} else {
				j++;
			}
		}

		int a = 0;
		for (int i = 0; i < length; i++) {
			if (fr[a] <= fr[i]) {
				a = i;
				answer = max[a];
			}
		}

		if (length == 1) {
			answer = array[0];
		} else {
			Arrays.sort(fr);
			if (fr[length - 1] == fr[length - 2]) {
				answer = -1;
			}
		}
		return answer;
	}
}