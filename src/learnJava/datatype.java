package learnJava;

public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(7%3);
		System.out.println(3%7);
		
		int i = 0;
		int j = 10;
		i++;
		j++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(1!=2); 
 */
//		char a1 = 'a';
//		char a2 = 97; //ASCI
//		char a3 = '\u0061';	//unicode

//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
		
		//equals
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		
		//indexOf: 인덱싱
		String d = "hello java";
		System.out.println(d.indexOf("java")); // 6
		
		//replaceAll: 특정 문자열을 다른 문자열로 교체
		String e = "Hello Java";
		System.out.println(e.replaceAll("Java", "World"));
		
		//substring: 특정 위치의 문자 추출
		String f = "Hello Java";
		System.out.println(f.substring(0, 4));
		
		//toUpperCase: 출력 글자를 모두 대문자로
		String g = "Hello Java";
		System.out.println(g.toUpperCase());
	}

}
