package level1;

import java.util.Arrays;


public class exam14 {
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        // 먼저 정렬
        //Arrays.sort(lost);
        //Arrays.sort(reserve);
        
        // 만약 빌려줄애랑 잃어버린애랑 같은애가 있다면
        // 빌려줄수가 없기때문에 -1로 만들고
        // 빌릴 필요도 없기때문에 -1로 만듬
        for (int i = 0; i < reserve.length; i++) {
        	for (int j = 0; j < lost.length; j++) {
        		if (reserve[i] == lost[j]) {
        			reserve[i] = -1;
        			lost[j] = -1;
        		}
        	}
        }
        
        // -1이 아닌애들이 진짜로 잃어버린애들
        // 그 애들을 찾아서 전체 인원에서 - 해줌
        int cnt = 0;
        for (int i = 0; i < lost.length; i++) {
        	if (lost[i] != -1) {
        		cnt++;
        	}
        }
        
        n = n - cnt;
        
        
        // 빌려줄수있는 아이와 잃어버린 아이들을 검사
        for (int i = 0; i < reserve.length; i++) {
        	for (int j = 0; j < lost.length; j++) {
        		//if (reserve[i] > 0 || reserve[i] <= 30) {
        			// 1번의 조건을 먼저 걸어줌
        			// -1인 애들은 +1을 하면 1보다 작기때문에 어차피 여기서 걸러짐
        			// 1 번은 0번을 빌려줄 수 없음
        			if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
        				lost[j] = -1;
        				reserve[i] = -1;
        				n++;
        				break;
        			}
        		//}
        	}
        }
        answer = n;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(5,new int[] {2,4}, new int[] {2,4}));
		System.out.println(solution(5,new int[] {2,4}, new int[] {3}));
		System.out.println(solution(3,new int[] {3}, new int[] {1}));
	}
}
