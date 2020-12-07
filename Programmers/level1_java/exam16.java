package level1;

import java.util.ArrayList;

public class exam16 {
	public ArrayList<Integer> solution(int []arr) {
        
        for (int i = 1; i < arr.length; i++) {
        	if (arr[i-1] == arr[i]) {
        		arr[i-1] = -1;
        	}
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] != -1) {
        		list.add(arr[i]);
        	}
        }
        return list;
    }
}
