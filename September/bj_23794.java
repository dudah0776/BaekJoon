package twentytwo.september;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_23794 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		N+=2;
		for(int i = 0 ; i<N ; i++) {
			if(i==0||i==N-1) {
				for(int j = 0 ; j<N; j++) {
					System.out.print("@");
				}
			}
			else {
				for(int j = 0 ; j<N ; j++) {
					if(j==0||j==N-1) {
						System.out.print("@");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
