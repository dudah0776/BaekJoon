package twentytwo.eight;
import java.util.*;
public class bj_1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int minx,miny;
		if(x>(w/2)) {
			minx=w-x;
		}
		else {
			minx=x;
		}
		if(y>(h/2)) {
			miny=h-y;
		}
		else {
			miny=y;
		}
		System.out.println(Math.min(minx, miny));
	}
}
