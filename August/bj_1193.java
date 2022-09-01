package twentytwo.eight;
import java.util.*;
public class bj_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int current=1 , max=1;
		for(int i = 2 ; i <= x; i++) {
			if(max == current) {
				max++;
				current=1;
			}
			else {
				current++;
			}
		}
		if(x==1) {
			System.out.println("1/1");
		}
		else {
			if(max%2==0) {
				System.out.println(current+"/"+((max-current)+1));
			}
			else {
				System.out.println(((max-current)+1)+"/"+current);
			}
		}
	}
}
