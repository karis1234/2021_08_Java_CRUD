package com.sbs.java.crud;

import java.util.Scanner; // ctrl + shift + 0

public class Main {
	public static void main(String[] args) {
		System.out.println("==���α׷� ����==");

		Scanner sc = new Scanner(System.in);
		System.out.printf("��ɾ� : ");
		// ��ĳ��
		// Scanner�� ��ü�� ����� 'sc'��� �������� �����Ѵ�.
		// �̷� 'sc'�� ���ؼ� ����ڰ� Ŀ�ǵ带 �Է��ϱ⸦ ��ٸ���.
		String command = sc.nextLine().trim();
		// ������ �޴´�. �� �Է��� ��ٸ��� �ִ� ���̴�.
		// nextLine -> ������ �޴´�!
		// ���� nextLine���� Line�� ���� ù��° ��ɾ�(���� ��������)�� �޴´�.
		// trim() -> ���� ������ �������� ������ �����.(���� �߰��� ������ ������ �ʴ´�.)
		System.out.printf("�Էµ� ��ɾ� : %s\n", command);
		// �Է��� ��ɾ ����ä�� ����Ѵ�.
		// �Է��� ��ɾ 2�� �̻������� ������ ��ɾ ����Ѵ�.

//		System.out.printf("��ɾ� : ");

//		int number = sc.nextInt();

//		System.out.printf("�Էµ� ���� : %d\n", number);
		

		sc.close();

		System.out.println("==���α׷� ��==");

	}
}
