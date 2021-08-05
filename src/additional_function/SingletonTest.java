package additional_function;

class Singleton {
	private static Singleton one;
	private Singleton() {
			}
	
	public static Singleton getInstance() {
//		return new Singleton();
		if (one == null) { one = new Singleton(); }
		return one;
	}
	
}


public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		System.out.println(sgt1 == sgt2);

	}

}
