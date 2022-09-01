package twentytwo.eight;

import java.io.*;
import java.util.*;

public class bj_2675 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i = 0 ; i<N ; i++) {
			String s = bf.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int num = Integer.parseInt(st.nextToken());
			String text = st.nextToken();
			for(int j = 0 ; j<s.length()-2 ; j++) {
				for(int k = 0 ; k<num ; k++) {
					System.out.print(text.charAt(j));
				}	
			}
			System.out.println();
		}
	}
}
