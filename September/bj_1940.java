package twentytwo.september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1940 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0 ; i<N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int start_idx = 0;
		int end_idx = N-1;
		int count = 0;
		while(start_idx<end_idx) {
			if(arr[start_idx]+arr[end_idx]<M) {
				start_idx++;
			}
			else if(arr[start_idx]+arr[end_idx]>M) {
				end_idx--;
			}
			else if(arr[start_idx]+arr[end_idx]==M){
				count++;
				start_idx++;
				end_idx--;
			}
		}
		System.out.println(count);
	}
}
