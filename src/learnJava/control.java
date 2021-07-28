package learnJava;

import java.util.*;

public class control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if문
		boolean money = true;
		if (money) {
			System.out.println("take a taxi");
		} else {
			System.out.println("walk!");
		}
//		"만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
		int don = 3000;
		if (don >= 3000) {
			System.out.println("택시를 타야지");
		} else {
			System.out.println("택시는 무슨... 그냥 걸어가자");
		}
		
//		and(&&), or(||), not(!) 연산자
//		x || y - x와 y 둘 중 적어도 하나가 참이면 참이다
//		x && y - x와 y 모두 참이어야 참이다
//		!x - x가 거짓이면 참이다
		int money1 = 2000;
		boolean hasCard = true;

		if (money1>=3000 || hasCard) {
		    System.out.println("택시를 타고 가라");
		} else {
		    System.out.println("걸어가라");
		}

//		contains
//		ex)"만약 주머니에 돈이 있으면 택시를 타고, 없으면 걸어가라“
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("mobile");
		pocket.add("money");
		
		if (pocket.contains("money")) {
			System.out.println("Taxi");
		} else {
			System.out.println("walk");
		}
		
//		elseif: 다중 조건 판단
//		ex) "지갑에 돈이 있으면 택시를 타고, 지갑엔 돈이 없지만 카드가 있으면 택시를 타고, 돈도 없고 카드도 없으면 걸어가라“
		boolean hasCard1 = true;
		ArrayList<String> pocket1 = new ArrayList<String>();
		pocket1.add("paper");
		pocket1.add("handphone");

		if (pocket1.contains("money")) {
		    System.out.println("택시를 타고 가라");
		}else if(hasCard1) {
		    System.out.println("택시를 타고 가라");
		}else {         
		    System.out.println("걸어가라");
		}
		
//		switch/case
		 int month = 8;
	        String monthString = "";
	        switch (month) {
	            case 1:  monthString = "January";
	                     break;
	            case 2:  monthString = "February";
	                     break;
	            case 3:  monthString = "March";
	                     break;
	            case 4:  monthString = "April";
	                     break;
	            case 5:  monthString = "May";
	                     break;
	            case 6:  monthString = "June";
	                     break;
	            case 7:  monthString = "July";
	                     break;
	            case 8:  monthString = "August";
	                     break;
	            case 9:  monthString = "September";
	                     break;
	            case 10: monthString = "October";
	                     break;
	            case 11: monthString = "November";
	                     break;
	            case 12: monthString = "December";
	                     break;
	            default: monthString = "Invalid month";
	                     break;
	        }
	        System.out.println(monthString);
		
//		while: 반복해서 수행해야 하는 경우
        int treeHit = 0;
        while (treeHit < 10) {
			treeHit++;
			System.out.println("나무를 "+treeHit+"번 찍었습니다.");
			if (treeHit == 10) {
				System.out.println("드디어 나무가 쓰러졌습니다");
			}
			
		}
		
//        while-break: 강제로 반복문 벗어날 때
        int coffee = 10;
        int money11 = 300;

        while (money11 > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
        
//      while-continue: 처음 조건문으로 돌아갈 때
//      홀수만 출력하는 프로그램
        int aa = 0;
        while(aa < 10) {
        		aa++;
        		if (aa % 2 == 0) {
        			continue;
        		}
        		System.out.println(aa);
        }
        
//      for 반복문: for (초기치; 조건문; 증가치)
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); // one two three
			
		}
        
//      ex) “총 5명의 학생이 시험을 보았는데 시험점수가 60점이 넘으면 합격이고 그렇지 않으면 불합격이다. 합격인지 불합격인지에 대한 결과를 보여준다.”
        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
			if (marks[i] >= 60) {
				System.out.println((i+1)+"번 학생 합격");
			} else {
				System.out.println((i+1)+"번 학생은 불합격");
			}
					
		}
//		for-continue
		int[] marks1 = {90, 25, 67, 45, 80};
		for(int j=0; j<marks1.length; j++) {
		    if (marks1[j] < 60) {
		        continue;
		    		}
		    System.out.println((j+1)+"번 학생 축하합니다. 합격입니다.");
		}
		
//		for를 활용한 구구단
		for (int i=2; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}

//		for-each: 일부 달라진 조건식
		String[] numbers1 = {"one", "two", "three"};
		for(String number: numbers1) {	// (int i=0; i<numbers.length; i++)
		    System.out.println(number);	// (numbers[i])
		}
		
	}

}
