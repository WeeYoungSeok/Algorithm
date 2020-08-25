## 문제

- 백준 11022 - A+B-8
- https://www.acmicpc.net/problem/11022

## 풀이

- 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
- 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

## 코드

```python
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(bf.readLine().trim());

		
		for (int i = 0; i < count; i++) {
			String[] result = bf.readLine().split(" ");
			int hap = Integer.parseInt(result[0])+Integer.parseInt(result[1]);
			bw.write("Case #"+(i+1)+": " + result[0] + " + " + result[1] + " = " +hap);
			bw.newLine();
		}
		bw.flush();
		bw.close();

	}
}
```

## 결과

![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FddQDUO%2FbtqG6gn9r8l%2F1fPeSOiozrKXj78ML5EtEk%2Fimg.png)