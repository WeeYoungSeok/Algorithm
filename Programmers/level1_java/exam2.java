package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class exam2 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		String temp = "";
		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;

		while (i < completion.length) {
			if (!completion[i].equals(participant[i])) {
				temp = participant[i];
				break;
			} else {
				i++;
			}

		}
		if (!temp.equals("")) {
			answer = temp;
		} else {
			answer = participant[participant.length - 1];
		}

		return answer;
	}

	public static void main(String[] args) {
		/*
		String[] ac = new String[] {"leo", "kiki", "eden"};
		String[] bc = new String[] {"eden", "kiki"};
		System.out.println(solution(ac,bc));
		
		String[] ad = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] bd = new String[] {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution(ad,bd));
		
		
		
		String[] a = new String[] {"mislav", "stanko", "mislav", "ana"};
		String[] b = new String[] {"stanko", "ana", "mislav"};
		System.out.println(solution(a,b));
		*/
		
		String[] participant = null;
		String[] completion = null;
		participant = new String[]{"mislav", "stanko", "mislav", "ana"};
		completion = new String[]{"stanko", "ana", "mislav"};
		HashMap<String, Integer> hm = new HashMap<>();
		for(String player : participant) {
			// getOrDefault : 해당 키가 존재하면 그에 대한 value리턴 없으면 0으로 지정한 값 리턴
			hm.put(player, hm.getOrDefault(player, 0)+1);
		}
		System.out.println(hm);
		// 처음 선수들 값을 넣어서 벨류 지정해주기 아래 설명있음
		
		for(String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		// 완주한 선수들 값을 찾아서 해당 선수의 벨류에서 -1해주기
		// 그러면 완주한 선수들은 벨류가 0이됨 
		// 하지만 동명이인이 있을경우 한번만 빼줘서 동명이인 1이 남게됨
		// 동명이인 없이 선수중에 완주를 못한 선수는 어차피 -1을 안해주므로 그대로 1임
		System.out.println(hm);
		
		
		// 키의 값만 하나씩 가져와서 string key에 넣어서
		// get(key)로 해당 벨류를 가져오기 
		// 그 벨류가 0이 아닌애는 완주 못한아이 출력
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0){
                System.out.println(key);
                break;
                // break가 있으면 끝까지 검사안하므로 더 성능이 좋아짐
            }
                
        }

		
		// 한줄이면 {}없어도됨
		// if (true) System.out.println("ㅎㅇ");
		/*
		이 부분을 보시면 hm에는 처음에 아무것도 없어요.

		hm.put(player, hm.getOrDefault("leo", 0)+1); 이렇게 시작을 할 텐데 hm에는 "leo"란 것이 없으니,
		hm.getOrDefault(player, 0) 결과는 0이 되겠죠.
		그래서 "leo"에는 0 + 1 인 1이 들어가는 겁니다.

		그러므로 모든 결과값이 1이 나오는 것입니다.
		*/
	}
}
