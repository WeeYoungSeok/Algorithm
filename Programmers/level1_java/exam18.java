package level1;

public class exam18 {
	public static long solution(long a, long b) {
		
        long temp = 0;
        
        // 첫째항부터 마지막항까지 더하기
        // 항의갯수 * ((2 * 첫째항) + (항의갯수 - 1)*공차)/2 
        if (a > b) {
        	temp = b;
        	b = a;
        	a = temp;
        }
        
        long cnt = b - a + 1;
        
         
        
        return cnt * (2*a + (cnt - 1))/2;
    }
	public static void main(String[] args) {
		System.out.println(solution(1,-100));
	}
}
