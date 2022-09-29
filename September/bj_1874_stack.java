package twentytwo.september;

import java.util.Scanner;
import java.util.Stack;

public class bj_1874_stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean trigger = true;
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack();
		int num =0;
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>=num) {
				while(num<=arr[i]) {
					stack.push(num);
					num++;
					sb.append("+\n");
				}
				sb.append("-\n");
				stack.pop();
			}
			else {
				int pop = stack.pop();
				if(pop > arr[i]) {
					System.out.println("NO");
					trigger = false;
					break;
				}
				else {
					sb.append("-\n");
				}
			}			
		}
		if(trigger) {
			System.out.println(sb);
		}
	}
}
