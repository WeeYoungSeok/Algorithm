package level1;

import java.util.ArrayList;
import java.util.Collections;

public class exam6 {
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		cnt++;
        		list.add(arr[i]);
        	}
        }
        Collections.sort(list);
        
        if (cnt == 0) {
        	list.add(-1);
        }
        
        
        return list;
    }
	
}
