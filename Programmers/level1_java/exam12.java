package level1;

import java.util.Arrays;

// 수포자 문제
public class exam12 {

	public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] soopo1 = {1,2,3,4,5};
        int soopocnt1 = 0;
        int soopoidx1 = 0;
        
        int[] soopo2 = {2,1,2,3,2,4,2,5};
        int soopocnt2 = 0;
        int soopoidx2 = 0;
        
        int[] soopo3 = {3,3,1,1,2,2,4,4,5,5};
        int soopocnt3 = 0;
        int soopoidx3 = 0;
        
        int max = 0;
        
        
        for (int i = 0; i < answers.length; i++) {
        	if (answers[i] == soopo1[soopoidx1]) {
        		soopocnt1++;
        	}
        	soopoidx1++;
        	if (soopoidx1 == 5) {
        		soopoidx1 = 0;
        	}
        	
        	if (answers[i] == soopo2[soopoidx2]) {
        		soopocnt2++;
        	}
        	soopoidx2++;
        	if (soopoidx2 == 8) {
        		soopoidx2 = 0;
        	}
        	
        	if (answers[i] == soopo3[soopoidx3]) {
        		soopocnt3++;
        	}
        	soopoidx3++;
        	if (soopoidx3 == 10) {
        		soopoidx3 = 0;
        	}
        	
        }
        
        
        
        
        max = soopocnt1;
        if (max < soopocnt2) {
        	max = soopocnt2;
        	answer = new int[] {2};
        }
        if (max < soopocnt3) {
        	max = soopocnt3;
        	answer = new int[] {3};
        }
        if (max == soopocnt1) {
        	answer = new int[] {1};
        }
        
        if (soopocnt1 == soopocnt2 && soopocnt2 == soopocnt3) {
        	answer = new int[] {1,2,3};
        } else if ((soopocnt1 == soopocnt2) && max != soopocnt3) {
        	answer = new int[] {1,2};
        } else if ((soopocnt1 == soopocnt3) && max != soopocnt2) {
        	answer = new int[] {1,3};
        } else if ((soopocnt2 == soopocnt3) && max != soopocnt1) {
        	answer = new int[] {2,3};
        }
 
        return answer;
    }
	
	public static void main(String[] args) {
		//System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5})));
		//System.out.println(Arrays.toString(solution(new int[] {1,3,2,4,2})));
	}
}
