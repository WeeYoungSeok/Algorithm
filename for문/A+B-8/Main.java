package backjoon;

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