package additional_function;

public class Counter {
	
	static int count = 0;	// static 추가
	
	Counter() {
		this.count++;
//		System.out.println(this.count);
	}
	
	public static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();		// 1 
		Counter c2 = new Counter();		// 1 -> static 추가 후 2
//		보통 변수의 static 키워드는 프로그래밍 시 메모리의 효율보다는 공유하기 위한 용도로 훨씬 더 많이 사용하게 된다.
		
		System.out.println(Counter.getCount());
	}

}
