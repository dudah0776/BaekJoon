package twentytwo.eight;
import java.util.Scanner;
public class bj_1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(hanNum(n));
	}
	public static int hanNum(int num) {
		if(num < 100) {
			return num;
		}
		else {
			int count=0;
			int temp;
			for(int i = 100 ; i <=num ; i++) {
				temp=i;
				int one = temp/100;
				temp=temp%100;
				int two = temp/10;
				temp=temp%10;
				int three = temp;
				if((one-two)==(two-three)) {
					count++;
				}
			}
			return count+99;
		}
	}
}
