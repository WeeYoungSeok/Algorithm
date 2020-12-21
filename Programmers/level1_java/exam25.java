package level1;

import java.util.ArrayList;

public class exam25 {
	// 가장 작은 수 제거하기
	public static ArrayList<Integer> solution(int[] arr) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean bool = false;
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		if (list.size() == 1) {
			list.removeAll(list);
			list.add(-1);
			return list;
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					bool = true;
				} else {
					bool = false;
					break;
				}
			}
			if (bool) {
				list.removeAll(list);
				list.add(-1);
				return list;
			} else {
				break;
			}
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}
		final int real_min = min;
		list.removeIf(n -> (n  == real_min));

		return list;
	}

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,1,1,1,1,1,2,2,2 }));
		System.out.println(solution(new int[] { 10 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1, 1 }));
		System.out.println(solution(new int[] { 5, 1, 2, 6, 8 }));
		System.out.println(solution(new int[] { 1, 5, 7, 3, 2, 6 }));
		System.out.println(solution(new int[] { 1,1,1,1,1,1,1,1 }));
	}

}
