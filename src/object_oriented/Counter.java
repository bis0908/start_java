package object_oriented;

//	Call by value

class Updater{
	public void update(int count) {	// 객체를 전달받게 변경. 원래는 int count. (변수명은 사용자 마음이다)
		count++;
	}
}

public class Counter {

	int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter myCounter = new Counter();
		System.out.println("before update: "+myCounter.count);
		
		Updater myUpdater = new Updater();
		myUpdater.update(myCounter.count);
		System.out.println("after update: "+myCounter.count);
	}

}
