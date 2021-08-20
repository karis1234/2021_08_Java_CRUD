package com.sbs.java.crud;

import java.util.Scanner; // ctrl + shift + 0

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);
		System.out.printf("명령어 : ");
		// 스캐너
		// Scanner의 객체를 만들고 'sc'라는 리모컨에 연결한다.
		// 이런 'sc'를 통해서 사용자가 커맨드를 입력하기를 기다린다.
		String command = sc.nextLine().trim();
		// 한줄을 받는다. 즉 입력을 기다리고 있는 중이다.
		// nextLine -> 한줄을 받는다!
		// 만약 nextLine에서 Line을 빼면 첫번째 명령어(띄어쓰기 전까지의)를 받는다.
		// trim() -> 문자 양쪽의 쓸때없는 공백을 지운다.(문자 중간의 공백은 지우지 않는다.)
		System.out.printf("입력된 명령어 : %s\n", command);
		// 입력한 명령어를 낚아채서 출력한다.
		// 입력한 명령어가 2개 이상있으면 마지막 명령어를 출력한다.

//		System.out.printf("명령어 : ");

//		int number = sc.nextInt();

//		System.out.printf("입력된 숫자 : %d\n", number);
		

		sc.close();

		System.out.println("==프로그램 끝==");

	}
}
