package com.chap01_runtimeException.run;

public class RunExcep {

	public static void main(String[] args) {
		//모든 예외는 Exception 클래스의 하위 클래스
		//모든 클래스는 Object 클래스의 하위 클래스
		//모든 예외는 해당 예외의 객체가 생성된다.
		//예외명의 객체가 catch문을 실행하며 생성되기 때문에 catch문의 ()안에 예외명과 레퍼런스 변수를 넣는다.
		
		//런타임 에러 실습(Unchecked Exception)
		
		RunExcep re = new RunExcep();
		
		//re.test01();
		re.test02();

	}
	
	public void test01() {
		//ArithmeticException
		//0으로 나눌 경우 발생
		/* 예외발생
		int no1 = 10, no2 = 0;
		int res = 0;
		
		res = no1 / no2;
		System.out.println("res : " + res);
		*/
		
		//해결1. if문 (예외가 발생하지 않도록 방지)
		/*
		int no1 = 10, no2 = 0;
		int res = 0;
		
		if(no2 == 0) {
			System.out.println("0입니다. 나눌 수 없습니다.");
		}
		else {
			res = no1 / no2;
			System.out.println("res : " + res);
		}
		*/
		
		//해결2. try catch문 (예외가 발생하면 처리할 내용을 기술)
		/* try { 예외 발생 가능 코드들 }
		 * catch (예외명 레퍼런스 변수명) { 예외발생 시 어떻게 처리할 것인지 정의한 코드 }
		 */
		int no1 = 10, no2 = 0;
		int res = 0;
		
		try {//예외가 발생할 수 있는 코드라인들
			res = no1 / no2;
			System.out.println("res : " + res);
		}
		catch(ArithmeticException a) {//예외발생 시 어떻게 처리할 것인지 내용을 기술
			//catch의 ()안에 처리할 예외명을 적고, 반드시 뒤에 참조변수를 붙이기.
			//예외명의 객체가 catch문을 실행하며 생성되기 때문에 catch문의 ()안에 레퍼런스 변수를 넣는 것이다.
			System.out.println("ArithmeticException 발생");
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}
	
	public void test02() {
		//ClassCastException
		//허용할 수 없는 형변환 연산을 진행하는 경우 발생
//		Object obj = 'a'; //char >> 자동 형변환 >> Character 객체 >> 다형성의 업캐스팅 >> Object 클래스 타입
//		System.out.println(obj); //
//		
//		String str = (String)obj; //ClassCastExcetpion 발생
//		System.out.println(str);
		
		Object obj = 'a'; //char >> 자동 형변환 >> Character 객체 >> 다형성의 업캐스팅 >> Object 클래스 타입
		System.out.println(obj); 
		
		//해결1. obj가 char인 것을 알기 때문에 강제로 적절한 형태로 형변환
		//Character str = (Character)obj; 
		
		//해결2. if문을 이용해 obj의 자료형에 따라 적절한 형태로 형변환
		if(obj instanceof String) {//instanceof 두 개의 클래스 타입을 비교해 같으면 true를, 다르면 false를 준다.
			String str = (String)obj;
			System.out.println("str : " + str);
		}
		else if(obj instanceof Character) {
			char ch = (Character)obj;
			System.out.println("char : " + ch);
		}
		
		System.out.println("---------------------------------------------------------------------------");
		
		//ArrayIndexOutOfBoundsException
		//배열의 인덱스 범위 외의 값에 접근할 경우 발생
		int [] arr = new int [2];
		arr [0] = 1;
		arr [1] = 2;
		
		//arr[2] = 3; //ArrayIndexOutOfBoundsException 발생
		
		//배열의 인덱스 범위까지만 출력시키면 예외발생의 원인 해결 가능.
		//예외처리 자체가 필요없게 만드는 것이 가장 좋다.
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------------------------------------------------------------");
		
		//NullPointerException
		//널 값을 참조할 경우 발생
		String str = null;
		//int length = str.length(); //NullPointerException 발생
		
		//참조되는 null 값이 있는 부분을 찾아 수정하면, 예외발생의 원인 해결 가능.
		//예외처리 자체가 필요없게 만드는 것이 가장 좋다.
	}

}
