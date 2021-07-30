package object_oriented;

//	Interface 개념
//	Class를 규정하여 같은 양식을 강제로 사용하도록 하게 제약을 걸어주는 것이다.(적용법은 implements + Class)

public class Zookeeper {
	
//	public void feed(Tiger tiger) {		인터페이스 적용 전
//		System.out.println("feed apple");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed banana");
//	}
	
	public void feed(Predator predator) {
		System.out.println("feed "+predator.getFood());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zookeeper zoo = new Zookeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zoo.feed(lion);
		zoo.feed(tiger);
	}

}
