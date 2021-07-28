package learnJava;

import java.util.*;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* list vs array 
		 * array: 배열의 크기가 정해져 있음.
		 * list: 자료형의 갯수가 가변할때 용이함.*/
		
		//add: list에 값 추가
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		System.out.println(pitches);	//[138, 129, 142]

		pitches.add(0, "119");	// [0]번째 자리에 119 데이터를 삽입
		System.out.println(pitches);		// [119, 138, 129, 142]		
		
		// 데이터 위치 조회
		System.out.println(pitches.get(2)); // 129 (세번째 데이터)
		
		// list 갯수 리턴
		System.out.println(pitches.size()); // 4
		
		// contains: 리스트 안에 해당 데이터가 있는지 boolean으로 리턴한다
		System.out.println(pitches.contains("142"));	//true
		
		// remove: data 삭제
		System.out.println(pitches.remove("129")); // 객체 삭제, 삭제 결과를 리턴 -> true
		System.out.println(pitches.remove(0));	// 인덱스 항목 삭제, 삭제된 항목을 리턴한다 -> 119
		System.out.println(pitches);	// [138, 142]
	}

}
