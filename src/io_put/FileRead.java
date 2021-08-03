package io_put;

//	파일 읽기

//import java.io.FileInputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b = new byte[1024];
//		FileInputStream input = new FileInputStream("C:/Users/sucki/Desktop/java_output.txt");
//		input.read(b);
//		System.out.println(new String(b));
//		input.close();
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/sucki/Desktop/java_output.txt"));
		while (true) {
			String line = br.readLine();
			if (line==null) break;
			
			System.out.println(line);
			}
			br.close();
		}

	}

