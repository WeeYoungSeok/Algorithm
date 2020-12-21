package level1;

public class exam27 {
	// 제곱근 찾기
	public long solution(long n) {
        long answer = 0;
        
        if (Math.pow(n, 0.5) % 1 > 0) {
        	answer = -1;
        } else {
        	answer = (long) ((Math.pow(n, 0.5)+1) *(Math.pow(n, 0.5)+1));
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(2.5%1);
	}
}
