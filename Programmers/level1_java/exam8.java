package level1;


public class exam8 {
	public static String solution(String s) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
        	char temp = 0;
        	for (int j = i+1; j < arr.length; j++) {
        		if (arr[i] < arr[j]) {
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        answer = new String(arr);
        return answer;
    }
	
	public static void main(String[] args) {
		String a = "Zbcdefg";
		System.out.println(solution(a));
	}
}
