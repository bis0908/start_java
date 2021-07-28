package learnJava;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열
		int[] odds = {1, 3, 5, 7, 9}; //배열은 0부터 n-1까지
//		System.out.println(odds);
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"}; // [0]~[6]
//		indexing
		System.out.println(weeks[3]); //목
		
//		반복문으로 배열값 뿌리기
		for(int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		System.out.println(weeks[7]);  // 8번째 배열값이 없으므로 ArrayIndexOutOfBoundsException 오류가 발생한다.
	}

}
