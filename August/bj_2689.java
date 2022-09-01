package twentytwo.eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2689 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());
		int result = (goal-down)/(up-down);
		if((goal-down)%(up-down)>0) {
			result++;
		}
		System.out.println(result);
	}
}