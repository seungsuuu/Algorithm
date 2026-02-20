import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arrayList.size() == 0) {
                arrayList.add(arr[i]);
            } else {
                if(arrayList.get(arrayList.size() -1) < arr[i]) {
                    arrayList.add(arr[i]);
                } else {
                    arrayList.remove(arrayList.size() -1);
                    i--;
                }
            }
        }
        
        int[] stk = new int[arrayList.size()];
        
        int idx = 0;
        for(int num : arrayList) {
            stk[idx] = num;
            idx++;
        }
        
        return stk;
    }
}