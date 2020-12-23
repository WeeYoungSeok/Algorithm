package level1;

import java.util.Arrays;

public class exam28 {
	// 짝수는 대문자
	// 홀수는 소문자
	public static String solution(String s) {
		// 미친새끼
		// 진짜 또라이들 개많다.
		// 너무 어렵게 접근하지말자 제발
		// 홀수 짝수 문제가 나온다??? cnt나 switching쓰자..
		// switching 은 bool타입으로 
		// 홀수만나고나서 체인지해주고 다시 짝수만나고 체인지해주기
		
	      String answer = "";
	      
	      String str[] = s.split("");
	      String space = " ";
	      int cnt = 0;
	      
	      for(int i = 0; i < str.length; i++){
	          if(str[i].equals(space)){
	             cnt = 0;
	          }else{
	             if(cnt % 2 == 0){
	                cnt++;
	                str[i] = str[i].toUpperCase();
	             }else{
	                 cnt++;
	                 str[i] = str[i].toLowerCase();
	             }
	          }
	          answer += str[i];
	      }
	      return answer;
	  }


	
	public static void main(String[] args) {
		System.out.println(solution(" try hello world strys "));
	}
}
