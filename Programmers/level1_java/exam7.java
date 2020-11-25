package level1;

import java.util.Arrays;

public class exam7 {
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		// 먼저 n에 대해서 정렬한다.
		for (int i = 0; i < strings.length; i++) {
			String temp = "";
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) > strings[j].charAt(n)) {
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}

		// n의 값이 같을때는 
		for (int i = 0; i < strings.length-1; i++) {
			String temp = "";
			for (int j = i+1; j < strings.length; j++) {
				if (strings[i].charAt(n) == strings[j].charAt(n)) {
					// 사전순으로 정렬하자 main 쪽에 설명있음
					if (strings[i].compareTo(strings[j]) > 0) {
						temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
					}
				}
			}
		}

		answer = strings;
		return answer;
	}

	public static void main(String[] args) {
		String[] a = new String[] { "sun", "bed", "car" };
		System.out.println(Arrays.toString(solution(a, 1)));

		String[] b = new String[] { "abce", "abcd", "cdx" };
		System.out.println(Arrays.toString(solution(b, 2)));

		String ab = "ACD";
		String db = "ABCDEF";
		System.out.println(ab.compareTo(db));
		// ab의 객체가 인수 db보다 사전적의미로 뒤에 있을경우
		// 양수를 리턴한다.
	}
}
