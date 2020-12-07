package level1;

public class exam17 {
	public static boolean solution(String s) {
		boolean answer = true;

		String reg = "^[0-9]*$";
		if (s.length() == 4 || s.length() == 6) {
			if (s.matches(reg)) {
				return answer;
			} else {
				answer = false;
			}
		} else {
			answer = false;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("a1234"));
		System.out.println(solution("1234"));
	}
}
