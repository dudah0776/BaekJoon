package twentytwo.eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bj_5622 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		int time=0;
		for(int i = 0 ; i<s.length(); i++) {
			char num = s.charAt(i); 
			switch(num) {
				case 'A': case 'B': case 'C':
					time+=3;
					break;
				case 'D': case 'E': case 'F':
					time+=4;
					break;
				case 'G': case 'H': case 'I':
					time+=5;
					break;
				case 'J': case 'K': case 'L':
					time+=6;
					break;
				case 'M': case 'N': case 'O':
					time+=7;
					break;
				case 'P': case 'Q': case 'R': case 'S':
					time+=8;
					break;
				case 'T': case 'U': case 'V': 
					time+=9;
					break;
				case 'X': case 'Y': case 'W': case 'Z':
					time+=10;
					break;
				default:
					time+=2;
					break;
			}
		}
		System.out.println(time);
	}
}
