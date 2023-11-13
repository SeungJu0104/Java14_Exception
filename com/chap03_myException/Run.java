package com.chap03_myException;

import java.io.IOException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("정수 하나 입력 : ");
		try {//check 메소드에서 예외가 발생할 수 있다.
			check(sc.nextInt());
		} catch (MyException e) {//check 메소드에서 발생한 예외를 어떻게 처리할 것인지 적는다.
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		*/
		System.out.print("이름을 입력 : ");
		
		try {
			String name = sc.nextLine();
			check2(name);			
		}
		catch (MyException2 e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void check(int num) throws MyException {//발생한 예외를 던진다.
		//System.out.println(num + " 입력 받았습니다.");
		
		if(num <= 0 || num >= 10) {
			//원하는 범위의 숫자가 아니면 내가 정의한 예외 발생시킨다.
			//내가 정의한 예외발생 1. 기본생성자
//			MyException me = new MyException();//내가 정의한 예외 클래스 객체를 하나 생성.
//			throw me;//throw로 예외를 발생시킨다.
			
			//내가 정의한 예외발생 2. 매개변수 생성자
			throw new MyException("1-9사이의 숫자가 아닙니다.");
			//실행하면 할아버지 클래스인 Throwable 클래스의 메소드까지 가서 처리된다.
			
		}
		else {
			System.out.println("100을 " + num + "으로 나눈 몫 : " + (100 / num));
		}
	}
	
	public static void check2 (String name) throws MyException2 {
		
		if(name.equals("남승주")) {
			throw new MyException2(name);
		}
	}

}
