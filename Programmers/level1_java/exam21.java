package level1;


public class exam21 {
	// 시저암호
	public static String solution(String s, int n) {
		String answer = "";
		char[] arr = s.toCharArray();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == ' ') {

				} else {
					if ((arr[i] >= 97 && arr[i] <= 122) && arr[i] + n > 122) {
						arr[i] = (char) (arr[i] + n - 122 + 96);
					} else if ((arr[i] >= 65 && arr[i] <= 90) && arr[i] + n > 90) {
						arr[i] = (char) (arr[i] + n - 90 + 64);
					} else {
						arr[i] = (char) (arr[i] + n);
					}
				}
			}

		answer = new String(arr);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("AaZz", 25));
	}
}
