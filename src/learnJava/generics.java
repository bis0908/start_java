package learnJava;

import java.util.*;

public class generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generics: <String> 이라는 제네릭스 표현식은 "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미한다.
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hello");
		alist.add("java");
		String o = alist.get(0);
		String b = alist.get(1);
		System.out.println(o+" "+b);
		
//		generics를 사용하지 않은 경우 (String) 명시를 해줘야 하는 불편함이 있다.
		ArrayList bList = new ArrayList();
		bList.add("hello");
		bList.add("java");
		String d = (String) bList.get(0);
		String c = (String) bList.get(1);
		System.out.println(d+" "+c);
	}

}
