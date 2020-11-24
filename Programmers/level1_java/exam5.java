package level1;

import java.util.ArrayList;

public class exam5 {
	public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int zegob = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (n < 3) {
        	answer = n;
        }
        while(n >= 3) {
        	cnt = n%3;
        	n = n/3;
        	list.add(cnt);
        	if (n < 3) {
        		list.add(n);
        	}
        }
        System.out.println(list);
        for (int i = list.size()-1; i >= 0; i--) {
        	if (list.get(i) > 0 ) {
        		answer += list.get(i) * (int)Math.pow(3, zegob);
        	}
        	zegob++;
        }
        return answer;
    }
}
