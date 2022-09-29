package twentytwo.september;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class bj_2644_dfs {
	static ArrayList<Integer>[] A;
	static boolean[] visited;
	static int cnt;
	static int result = -1;
 	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		//연결리스트 선언
		A = new ArrayList[n+1];
		//방문 행렬 초기화
		visited = new boolean[n+1];
		//연결리스트 초기화
		for(int i=1; i<n+1; i++) {
			A[i] = new ArrayList<Integer>();
		}
		int k = Integer.parseInt(bf.readLine());
		for(int i=0 ; i<k ; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			A[s].add(e);
			A[e].add(s);
		}
		cnt=0;
		dfs(start, end, cnt);
		System.out.println(result);
	}

	public static void dfs(int v, int end, int cnt) {
		visited[v] = true;
		for (int i : A[v]) {
			if (visited[i] == false) {
				if(i==end) {
					result = cnt+1;	
					return;
				}			
				dfs(i, end, cnt+1);
			}
		}
 		
 	}
}
