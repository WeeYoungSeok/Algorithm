package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exam1 {
	public static int[] solution(int[] numbers) {
		int[] answer = {};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < numbers.length-1; i++) {
        	for (int j = i+1; j < numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);	
        	}
        }
        
        answer = new int[set.size()];
        int i = 0;
        /*Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
        	answer[i] = iter.next();
        	i++;
        }*/
        
        for (int a : set) {
        	answer[i] = a;
        	i++;
        }
        Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		/*
		 * long n = 118372; System.out.println(solution2(n));
		 */
		int[] a = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(a)));
	}
}
