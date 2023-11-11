package com.chap02_throw.run;

import java.io.IOException;

public class Run {
	//모든 예외는 Exception 클래스의 하위 클래스
	//모든 클래스는 Object 클래스의 하위 클래스
	//모든 예외는 해당 예외의 객체가 생성된다.
	//예외명의 객체가 catch문을 실행하며 생성되기 때문에 catch문의 ()안에 예외명과 레퍼런스 변수를 넣는다.
			
	//IO예외 실습(Checked Exception)

	public static void main(String[] args) /*throws IOException*/ {//발생한 IO예외를 다른 곳으로 던진다.(throws) 메인에서 throws 하면 JVM으로 던지고 JVM은 에러를 출력한다.
		
		try {
			methodA();			
		}
		catch(IOException e) {//e는 IOException 클래스 타입 객체의 레퍼런스 변수
			System.out.println("main()에서 예외를 try - catch문으로 처리");
		}
		//메인이 methodA를 실행하기위해서는
		//throws로 발생한 예외를 다른 곳에 던지거나
		//try - catch로 예외를 처리해야한다.
		
	}
	
	public static void methodA() throws IOException {//발생한 IO예외를 다른 곳으로 던진다.(throws)
		methodB();
		//methodA가 methodB를 실행하기위해서는
		//throws로 발생한 예외를 다른 곳에 던지거나
		//try - catch로 예외를 처리해야한다.
	}
	
	public static void methodB() throws IOException {//발생한 IO예외를 다른 곳으로 던진다.(throws)
		methodC();
		//methodB가 methodC를 실행하기위해서는
		//throws로 발생한 예외를 다른 곳에 던지거나
		//try - catch로 예외를 처리해야한다.
	}
	
	public static void methodC() throws IOException {//발생한 IO예외를 다른 곳으로 던진다.(throws)
		throw new IOException();
		//IOException 클래스의 객체를 생성(즉, 예외를 강제 발생)(throw)
		//해결1. throws로 다른 곳에 예외를 던진다.
		//해결2. try - catch로 발생한 예외를 처리한다.
	}

}
