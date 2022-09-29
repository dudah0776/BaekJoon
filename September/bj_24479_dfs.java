package twentytwo.september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_24479_dfs {
	static ArrayList<Integer>[] A;
	static boolean visited[];
	static int cnt;
	static int check[];
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		A = new ArrayList[N+1];
		visited = new boolean[N+1];
		check = new int[N+1];
		//리스트 생성
		for(int i=1 ; i<N+1 ; i++) {
			A[i] = new ArrayList<Integer>();
		}
		for(int i=0 ; i<M ; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		for(int i=1 ; i<N+1 ; i++) {
			Collections.sort(A[i]);
		}
		cnt=1;
		dfs(start);
		for(int i=1; i<check.length; i++) {
			System.out.println(check[i]);
		}
		
	}	
	public static void dfs(int v) {
		visited[v] = true;
		check[v]=cnt;
		cnt++;
		for(int i : A[v]) {
			if(visited[i]==false) {
				dfs(i);
			}
		}
	}
}
