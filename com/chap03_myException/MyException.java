package com.chap03_myException;

public class MyException extends Exception{//상복받아 예외 클래스 선언
	//사용자 정의 예외 클래스
	//생성자 생성해두는게 나중에 사용할 때 좀 더 편하다.
	public MyException() {}
	public MyException(String msg) {
		super(msg);//부모객체를 먼저 호출해야한다.
	}
	

}
