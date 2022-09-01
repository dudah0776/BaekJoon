package twentytwo.eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2908 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		a=changeNum(a);
		b=changeNum(b);
		if(a>b) System.out.println(a);
		else System.out.println(b);
	}
	public static int changeNum(int a) {
		int temp;
		int first = a/100;
		a=a%100;
		int second = a/10;
		a=a%10;
		int thrid = a;
		return thrid*100+second*10+first;
	}
}
