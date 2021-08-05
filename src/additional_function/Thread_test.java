package additional_function;

public class Thread_test extends Thread {
	
	int seq;
	public Thread_test(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println(this.seq+" thread is run");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
		System.out.println(this.seq+" thread is end");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i<10; i++) {
			Thread t = new Thread_test(i);
			t.start();
		}
			
//		Thread 클래스를 extends 했기때문에 start() 메소드 실행 시 run 메소드가 수행되는 것이다. 
//		Thread 클래스는 start 실행 시 run 메소드가 수행되도록 내부적으로 코딩되어 있다.

	}

}
