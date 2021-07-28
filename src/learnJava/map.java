package learnJava;

import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		python의 dict형과 비슷함. key:value를 한 쌍으로 가지고 있다
//		HashMap
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("people", "사람");	// put: data input
		map.put("baseball", "야구");
		
//		해당 key의 value return
		System.out.println(map.get("people"));	// 사람
		
//		containsKey: 해당 key가 있는지 결과값 return(true/false)
		System.out.println(map.containsKey("people"));	// true
		
//		remove: key에 해당하는 items(key, value) 삭제후 value return
		System.out.println(map.remove("people"));
		
//		size: HashMap의 갯수를 return
		System.out.println(map.size()); 	// 1
		
	}

}
