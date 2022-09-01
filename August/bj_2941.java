package twentytwo.eight;
import java.util.*;

public class bj_2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String s = sc.next();
		for(int i = 0 ; i<arr.length; i++) {
			s = s.replaceAll(arr[i], "*");	
		}
		System.out.println(s.length());
	}
}
