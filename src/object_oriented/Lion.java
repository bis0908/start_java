package object_oriented;

//public class Lion extends Animal implements BarkablePredator {

public class Lion extends Predator implements Barkable {
	
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
