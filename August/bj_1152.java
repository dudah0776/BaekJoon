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
//		StringTokenizer(String str, String delim)	���ڿ�(str)�� ������ ������(delim)�� ������ StringTokenizer�� �����Ѵ�.(�����ڴ� ��ū���� ���ֵ��� ����)
//		StringTokenizer(String str, String delim, boolean returnDelims)	���ڿ�(str)�� ������ ������(delim)�� ������ StringTokenizer�� �����Ѵ�. returnDelims�� ���� true�� �ϸ� �����ڵ� ��ū���� ����.
//		int countTokens()	�и��� ��ü ��ū�� ���� ��ȯ
//		boolean hasMoreTokens()	��ū�� �����ϸ� True ����
//		String nextToken()	���� ��ū�� ��ȯ (The next token from this string tokenizer)
	}
}
