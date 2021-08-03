package io_put;

import java.io.BufferedReader;		// 3. 사용자 입력 그대로 모두 출력할때(String)
import java.io.InputStream;			// 1. 콘솔 입력 받을 때(byte)
import java.io.InputStreamReader;	// 2. 문자열 그대로 출력할 때 사용(char)

//	java console In/Out put

public class StreamTest {

	public static void main(String[] args) throws Exception {	// InputStream으로 부터 값을 읽어들일 때는 IOException이 발생할 수 있기 때문에 예외처리를 해야 하는데 throws로 그 예외처리를 뒤로 미루게 한 것
		// TODO Auto-generated method stub
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);	// added 2
		BufferedReader br = new BufferedReader(reader);			// added 3
		
//		char[] a = new char[3];	// byte -> char로 자료형 바뀜
//		reader.read(a);
		String a = br.readLine();

		System.out.println(a);
		

	}

}
