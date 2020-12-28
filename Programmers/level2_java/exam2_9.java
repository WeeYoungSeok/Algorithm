package level2;

import java.util.Arrays;

public class exam2_9 {

	public static int solution(String skill, String[] skill_trees) {
		// 스킬트리
		int answer = 0;
		int[][] arr = new int[skill_trees.length][skill.length()];
		for (int a[] : arr) {
			Arrays.fill(a, -2);
		}

		char[] Cskill = skill.toCharArray();
		
		// 테스트케이스 14번이 이 조건
		// 스킬 C이거나 B이런식으로 한자리면
		// 어떤 스킬이 들어와도 다 배울 수 있음.
		if (Cskill.length == 1) {
			return skill_trees.length;
		}

		// 스킬이 존재하지않으면 -1인데
		// -1로 넣으면 검사가 조금 까다로워져서
		// 존재하면 안되는 숫자 27을 넣어서 계산함.
		for (int i = 0; i < skill_trees.length; i++) {
			for (int j = 0; j < Cskill.length; j++) {
				if (skill_trees[i].indexOf(Cskill[j]) == -1) {
					arr[i][j] = 27;
				} else {
					arr[i][j] = skill_trees[i].indexOf(Cskill[j]);
				}
			}
		}

		boolean bool = false;
		boolean notlean = false;
		Loop1: for (int i = 0; i < arr.length; i++) {
			Loop2: for (int j = 0; j < arr[i].length; j++) {
				Loop3: for (int k = j + 1; k < arr[i].length; k++) {
					if (arr[i][j] != 27) {
						if (arr[i][j] < arr[i][k] && (arr[i][k] != 27)) {
							bool = true;
						} else if (arr[i][j] < arr[i][k] && (arr[i][k] == 27)) {
							continue;
						} else if (arr[i][j] >= arr[i][k] && (arr[i][k] == 27)) {
							continue;
						} else {
							bool = false;
							break Loop2;
						}
					} else {
						if (arr[i][k] == 27) {
							notlean = true;
							continue;
						} else {
							notlean = false;
							bool = false;
							break Loop2;
						}
					}
				}
			}
			// 하나의 스킬트리를 검사하고나서
			// 최종으로 가능한 스킬트리인지 아닌지 검사 후
			// 다음 스킬트리 검사를 위해 초기화
			if (notlean || bool) {
				notlean = false;
				bool = false;
				answer += 1;
			} else {
				notlean = false;
				bool = false;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));
		System.out.println("답 : 2");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA", "AQWER" }));
		System.out.println("답 : 3");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CED" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("ABC", new String[] { "OPQ" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "AQBD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "C" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "B" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "D" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CB" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CABDSER", new String[] { "ANM", "ER", "REWQ", "CL" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BC" }));
		System.out.println("답 : 0");
		System.out.println();

		System.out.println(solution("CBD", new String[] { "CXF", "ASF", "BDF", "CEFD" }));
		System.out.println("답 : 2");
		System.out.println();

		System.out.println(solution("C", new String[] { "BC", "AA" }));
		System.out.println("답 : 2");
		System.out.println();

		System.out.println(solution("BDC", new String[] { "AAAABACA" }));
		System.out.println("답 : 0");
		System.out.println();

		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));
		System.out.println("답 : 2");
		System.out.println();

		System.out.println(solution("ABC", new String[] { "X", "OP", "STU" }));
		System.out.println("답 : 3");
		System.out.println();

		System.out.println(solution("CBDK",
				new String[] { "CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK" }));
		System.out.println("답 : 4");
		System.out.println();

	}
}
