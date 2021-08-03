package io_put;

//	파일 쓰기

//import java.io.FileOutputStream; -> String을 byte 배열로 변환해야 하는 불편함 있음
//import java.io.FileWriter;	// byte 배열 대신 문자열을 직업 파일에 쓸 수 있음. 하지만 줄 바꿈 부호 삽입은 그대로 존재한다.
import java.io.*;

public class FileWrite {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		PrintWriter pw = new PrintWriter("C:/Users/sucki/Desktop/java_output.txt");
		for (int i=0; i<11; i++) {
			String data = i+" 번째 줄 입니다.";	// FileWriter class를 사용하더라고 줄바꿈 부호는 넣어줘야 함.
			pw.println(data);
		}
		pw.close();
		
		PrintWriter pw2 = new PrintWriter("C:/Users/sucki/Desktop/java_output.txt");
		for (int i=0; i<21; i++) {
			String data = i+" 번째 줄 입니다.";
			pw2.write(data);
			pw2.println(data);
		}
		pw2.close();
	}

}
