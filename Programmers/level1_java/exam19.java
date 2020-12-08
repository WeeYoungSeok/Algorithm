package level1;

public class exam19 {
	boolean solution(String s) {
        int pcnt = 0;
        int ycnt = 0;
        
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.toLowerCase().charAt(i) == 'p') {
        		pcnt++;
        	} else if (s.toLowerCase().charAt(i) == 'y') {
        		ycnt++;
        	}
        }

        return (pcnt == ycnt) ? true : false;
    }
}
