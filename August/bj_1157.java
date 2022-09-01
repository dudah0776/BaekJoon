package twentytwo.eight;
import java.util.*;

public class bj_1157 {
	public static void main(String[] args) {
		//A : 65, Z : 90
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		String s = sc.next();
		s = s.toUpperCase();
		int max = 0;
		int maxarr=0;
		boolean isEqual=false;
		for(int i = 0 ; i<s.length(); i++) {
			int n = s.charAt(i);
			arr[n-65]++;
		}
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				maxarr=i;
				isEqual = false;
			}
			else if(arr[i]== max) {
				isEqual = true;
			}			
		}
		if(isEqual) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(maxarr+65));
		}
		
	}
}
