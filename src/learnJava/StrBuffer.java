package learnJava;

public class StrBuffer {
	public static void main(String[] args) {
		
		//문자열 추가 or 변경
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("jump to java");
		System.out.println(sb.toString()); //hello jump to java
		
		//결과는 같지만 다른 방법
		String temp = "";
        temp += "hello";
        temp += " ";
        temp += "jump to java";
        System.out.println(temp); //hello jump to java
		/* ↑↑↑
		 * 문자열 추가나 변경등의 작업이 많을 경우에는 StringBuffer를, 
		 * 문자열 변경 작업이 거의 없는 경우에는 그냥 String을 사용하는 것이 유리하다.
		 */
        
        //insert: 특정 위치에 문자열 삽입
        StringBuffer sb1 = new StringBuffer();
        sb1.append("jump to java");
        sb1.insert(0, "Get Ready to ");
        System.out.println(sb1.toString()); //Get Ready to jump to java
        
        //substring: String 자료형의 substring 메소드와 사용법이 동일하다
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Hello jump to java");
        System.out.println(sb2.substring(0, 4));
        
        
	}
}