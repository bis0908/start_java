package object_oriented;

//public class Tiger extends Animal implements BarkablePredator{

//	extends 키워드를 사용해 추상클래스를 상속.
public class Tiger extends Predator implements Barkable {	

	public String getFood() {
		return "apple";
	}

	public void bark() {
		System.out.println("어흥");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	


}
