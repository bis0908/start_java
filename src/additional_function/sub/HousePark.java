package additional_function.sub;

//import additional_function.Wonseok_Kong;

//	접근제어자를 별도로 설정하지 않는다면 접근제어자가 없는 변수, 메소드는 default 접근제어자가 되어 해당 패키지 내에서만 접근이 가능하다.

/*	접근제어자가 protected로 설정되었다면 protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 
 * 	해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능하다.*/

public class HousePark {
	static String lastname = "park";	// 항상 동일한 값이 들어간다면 static을 붙여준다. (메모리 할당 효율)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HousePark pk = new HousePark();
		HousePark pe = new HousePark();
//		System.out.println(pk.lastname);

	}

}
