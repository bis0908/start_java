package object_oriented;

//	로컬 변수 연습

//public class Method2 {
//    public int vartest(int a) {
//        a++;
//        return a;
//    }
//
//    public static void main(String[] args) {
//        int a = 1;
//        Method2 myTest = new Method2();
//        a = myTest.vartest(a);
//        System.out.println(a);
//    }
//}

public class Method2 {

    int a;  // 객체변수 a

    public void vartest() { 	// Method2의 객체를 입력받는다
    	this.a++;
    }

    public static void main(String[] args) {
        Method2 myTest = new Method2();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    }
}
