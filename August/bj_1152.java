package twentytwo.eight;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class bj_1152 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
//		StringTokenizer(String str, String delim)	문자열(str)을 지정된 구분자(delim)로 나누는 StringTokenizer를 생성한다.(구분자는 토큰으로 간주되지 않음)
//		StringTokenizer(String str, String delim, boolean returnDelims)	문자열(str)을 지정된 구분자(delim)로 나누는 StringTokenizer를 생성한다. returnDelims의 값을 true로 하면 구분자도 토큰으로 간주.
//		int countTokens()	분리한 전체 토큰의 개수 반환
//		boolean hasMoreTokens()	토큰이 존재하면 True 리턴
//		String nextToken()	다음 토큰을 반환 (The next token from this string tokenizer)
	}
}
