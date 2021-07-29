package object_oriented;

//	클래스의 상속(Inheritance)

public class Dog extends Animal {
	
	public void sleep() {
		System.out.println(this.name+" Zzz");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();

	}

}
