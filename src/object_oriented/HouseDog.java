package object_oriented;

//	Method Overriding

public class HouseDog extends Dog{
	
	public HouseDog(String name) {	// A1) <- 사용자 생성자가 존재하기 때문이다.
		this.setName(name);
	}

	public void sleep() {
		System.out.println(this.name + " Zzz in house");
	}

//	Overloding
	public void sleep(int hour) {	// method 입력 항목이 다를 경우 가능함
		System.out.println(this.name+" ZzZ in house for "+hour+" hours");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HouseDog hd = new HouseDog();
//		hd.setName("happy");
//		hd.sleep();
//		hd.sleep(3);

//		*** 사용자가 작성한 생성자가 하나라도 구현되어 있다면 컴파일러는 디폴트 생성자를 추가하지 않는다.
//		Q1) 아래에서 new HouseDog(인자 없음); 실행시 에러가 나는 이유는?
		HouseDog dog = new HouseDog("pori");
		System.out.println(dog.name);
		
	}

}
