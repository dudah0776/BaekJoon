package twentytwo.september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_11659 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String second = bf.readLine();
		int[] arr = new int[N+1];
		arr[0]=0;
		StringTokenizer st2 = new StringTokenizer(second);
		int total = 0;
		for(int i = 1 ; i<=N ; i++) {
			total += Integer.parseInt(st2.nextToken());
			arr[i] = total; 
		}
		for(int i = 0 ; i<M; i++) {
			String section = bf.readLine();
			StringTokenizer st3 = new StringTokenizer(section);
			int a = Integer.parseInt(st3.nextToken());
			int b = Integer.parseInt(st3.nextToken());
			System.out.println(arr[b]-arr[a-1]);
		}
	}
}
