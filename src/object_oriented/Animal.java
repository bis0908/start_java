package object_oriented;


public class Animal {	//	과자틀에서 찍어낸 과자를 생각해보자
	String name;
	
	public void setName(String name) {
		this.name = name;	// Animal class에 의해 생성된 객체를 지칭한다
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Animal();

		cat.setName("boby");
		System.out.println(cat.name); // boby, 객체 변수는 '.'을 통해 접근한다. 객체.객체변수
		
		Animal dog = new Animal();
		dog.setName("happy");
		System.out.println(dog.name);	// ***객체 변수는 공유되지 않는다. 	
		
		
	}
	
}