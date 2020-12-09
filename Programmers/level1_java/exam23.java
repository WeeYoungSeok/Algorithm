package level1;

public class exam23 {
	// 자리수 더하기
	public int solution(int n) {
        /*
		int answer = 0;
        char[] arr = Integer.toString(n).toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
        	answer += Integer.parseInt(arr[i] + "");
        }
        */
		
		int answer = 0;

        while(true){
            answer+=n%10;
            if(n<10) {
                break;
            }

            n=n/10;
        }

        return answer;
    }
}
