package level2;

import java.util.Arrays;

public class exam2_4 {
	public static int solution(int n) {
		// 숫자의 표현
		int answer = 0;

		int cnt = 1;
		int count = 1;
		int sum = 0;

		while (count <= n) {
			while (cnt <= n) {
				sum += cnt;
				cnt++;
				if (sum == n) {
					answer += 1;
					break;
				} else if (sum > n) {
					break;
				}
			}
			cnt = 1 + count;
			sum = 0;
			count++;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(16));
	}
}
