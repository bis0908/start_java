package object_oriented;

public class Method {
	
	/*
	 * 여러 번 반복해서 사용된다는 것은 언제고 또다시 사용할 만한 가치가 있는 부분이라는 뜻이다. 
	 * 즉, 이러한 경우 이것을 한 뭉치로 묶어서 “어떤 입력값을 주었을 때 어떤 리턴값을 돌려준다”라는 식의 
	 * 메소드를 작성하는 것이 현명한 일일 것이다.
	 * 
	 * 메소드의 구조
	 * public 리턴자료형 메소드명(입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
    			...    
    			return 리턴값;  -> 리턴 자료형이 void 인 경우에는 return 문이 필요없다.
		}
		
		메소드의 종류
			1. 입력 O / return O
			2. 입력 X / return X
			3. 입력 X / return O
			4. 입력 O / return X
	 */
	
	public int sum(int a, int b) {
		return a+b;
	}
	
//	"==" 비교 연산자는 주소값을 비교하고
//	equals() 메소드는 내용 자체를 비교 즉 데이터 값을 비교한다.
	
	public void say_nick(String nick) throws FoolException {
		if ("fool".equals(nick)) {
	    	throw new FoolException();
	    	} 
	    	System.out.println("나의 별명은 "+nick+" 입니다.");
	    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method plus = new Method();
		try {
			plus.say_nick("fool");
			plus.say_nick("kong");
		} catch (FoolException e) {
	    	System.err.println("FoolException Occured");
		}
	}

}
