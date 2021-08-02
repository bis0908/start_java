package object_oriented;

//	하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 객체지향 세계에서는 다형성, 폴리모피즘(Polymorphism)이라고 부른다.
//	인터페이스는 일반 클래스와는 달리 extends 를 이용하여 여러개의 인터페이스(Predator, Barkable)를 동시에 상속할 수 있다. 
//	즉, 다중 상속이 지원된다. (※ 일반 클래스는 단일상속만 가능하다.)
//	Tiger.java, Lion.java, Barkable.java, BarkablePredator.java 참조

public class Bouncer {
	
	public void barkAnimal(Barkable animal) {
		animal.bark();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger tiger = new Tiger();
		Lion lion =  new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
				
	}

}
