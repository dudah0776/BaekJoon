package twentytwo.eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1018 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] board = new char[N][M];
		char[][] chess = {{'W','B','W','B','W','B','W','B'},
						  {'B','W','B','W','B','W','B','W'},
						  {'W','B','W','B','W','B','W','B'},
						  {'B','W','B','W','B','W','B','W'},
						  {'W','B','W','B','W','B','W','B'},
						  {'B','W','B','W','B','W','B','W'},
						  {'W','B','W','B','W','B','W','B'},
						  {'B','W','B','W','B','W','B','W'}};
		
		char[][] chess2 = {{'B','W','B','W','B','W','B','W'},
						   {'W','B','W','B','W','B','W','B'},
						   {'B','W','B','W','B','W','B','W'},
						   {'W','B','W','B','W','B','W','B'},
						   {'B','W','B','W','B','W','B','W'},
						   {'W','B','W','B','W','B','W','B'},
						   {'B','W','B','W','B','W','B','W'},
						   {'W','B','W','B','W','B','W','B'}};
		int[][] board2 = new int[N][M];
		
		//판때기 채우기
		for(int i = 0 ; i<N; i++) {
			String ss = bf.readLine();
			for(int j = 0 ; j<M ; j++) {
				board[i][j]=ss.charAt(j);			
			}
		}
		int max=0;
		int maxcol=0,maxrow=0,score1,score2;		
		for(int i = 0 ; i<=N-8; i++) {
			for(int j = 0 ; j<=M-8 ; j++) {
				score1=getScore(board, chess, i, j);
				score2=getScore2(board, chess2, i, j);
				if(score1>=score2) {
					if(score1>=max) {
						max=score1;
						maxcol=i;
						maxrow=j;
					}
				}
				else {
					if(score2>=max) {
						max=score2;
						maxcol=i;
						maxrow=j;
					}
				}
			}
		}
		int result = Math.min(64-getScore(board,chess,maxcol,maxrow), 64-getScore2(board,chess2,maxcol,maxrow));
		System.out.println(result);
	}
	public static int getScore(char[][] board, char[][] chess, int a, int b) {
		int score=0;
		for(int i = 0 ; i<8; i++) {
			for(int j = 0 ; j<8 ; j++) {
				if(board[i+a][j+b]==chess[i][j]) {
					score++;
				}
			}
		}
		return score;
	}
	public static int getScore2(char[][] board, char[][] chess2, int a, int b) {
		int score=0;
		for(int i = 0 ; i<8; i++) {
			for(int j = 0 ; j<8 ; j++) {
				if(board[i+a][j+b]==chess2[i][j]) {
					score++;
				}
			}
		}
		return score;
	}
}
