package twentytwo.eight;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bg_1316 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(bf.readLine());
		int result = 0;
		for(int i = 0 ; i<N ; i++) {
			String s = bf.readLine();
			s=s+"*";
			for(int j = 0 ; j<s.length(); j++) {
				char c = s.charAt(j);
				int count=0;
				s = s.replace(String.valueOf(c), "!");
				String[] arr = s.split("!");
				for(int k = 0 ; k<arr.length ; k++) {
					if(!arr[k].equals("")) {
						count++;
					}
				}
				if(count>=2) {
					result++;
					break;
				}
			}
		}
		System.out.println(N-result);
	}
}
