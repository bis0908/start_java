package object_oriented;

//public interface Predator {

//	추상메소드는 구체적 로직을 갖고 있지 않고 형식만을 가지고 있다.
//	ㄴ> 상속을 강제하고 있음을 의미한다.


public abstract class Predator extends Animal { // abstract를 내부에 갖고 있기 때문에 class도 abstract 속성을 가지게 된다. 
	public abstract String getFood();


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
