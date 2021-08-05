package additional_function;

//	private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다



public class AccessModifier {
//	secret 변수와 getSecret 메소드는 오직 AccessModifier 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능하다.
	private String secret;
	private String getSecret() {
		return this.secret;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
