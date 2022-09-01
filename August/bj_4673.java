package twentytwo.eight;

public class bj_4673 {
	public static void main(String[] args) {
		boolean[] arr = new boolean[10001];
		for(int i = 1; i <=arr.length ; i++) {
			if(selfNum(i)<arr.length) {                                   
				arr[selfNum(i)]=true;
			}
		}
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i]==false) {
				System.out.println(i);
			}
		}
	}
	public static int selfNum(int num) {
		int total = 0;
		int temp=num;
		while(num>0) {
			total+=num%10;
			num=num/10;
		}
		temp+=total;
		return temp;	
	}
}
