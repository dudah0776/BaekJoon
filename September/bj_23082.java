package twentytwo.september;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_23082 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0 ; j<N*5 ; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		for(int i = 0 ; i<4*N ; i++) {
			for(int j = 0 ; j<N ; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
