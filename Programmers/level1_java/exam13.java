package level1;

import java.util.Arrays;

public class exam13 {
	// 에라토스테네스의 체
	public static int solution(int n) {
		int answer = 0;
		// 처음에 전부 false true면 해당 인덱스 리턴
		boolean[] search = new boolean[n + 1];
		// 0번지 1번지는 의미가 없음 소수가 아니기 때문
		search[0] = search[1] = false;

		// 0번지와 1번지를 제외하고 전부 true로 채워줌
		for (int i = 2; i <= n; i++) {
			search[i] = true;
		}

		// 2번지부터 검사함 2번지는 숫자 2를 의미
		// 그것을 제곱한 값이 주어진 숫자보다 큰지 검사
		// 만일 크다면 더 이상 검사를 안해도됨 그전 숫자들이 다걸러줌
		for (int i = 2; i * i <= n; i++) {
			// 여기서 먼저 2의 배수들은 전부 false가 되었으므로 굳이 검사를 안들어가도됨
			// 마찬가지고 3의 배수들도 안들어가도되고
			// 4가 들어오는 순간 4는 애초에 false라 안들어감
			// 5는 true라서 들어가서 또 5의 배수들을 제외시켜줌
			if (search[i]) {
				// 제외 안된 애들이 들어오게됨
				// 2 3 5 7 거르다가 11이 그 이후로 들어와서
				// j가 121부터 시작하게되는데 121은 그러면 1, 11, 121의 약수가 존재하므로 
				// 소수가 안됨 여기서 121은 걸러짐 고로 위에 포문에서 121은 안들어오게 됨
				// 똑같이 121 + 11해서 132도 false로 만들어줌 132는 소수가 아님
				for (int j = i * i; j <= n; j += i) {
					search[j] = false;
				}
			}
		}
		// 이렇게 반복돼서 결국 소수들만 true상태로남게됨

		for (int i = 0; i <= n; i++) {
			if (search[i] == true) {
				answer++;
			}
		}
		// true일때만 ++을 해줘서 소수갯수 찾기
		// 어렵다;;

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(20000000));
		// System.out.println(solution(5));
	}

}
