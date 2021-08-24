package com.sbs.java.crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("==프로그램 시작==");
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0;

		List<Article> articles = new ArrayList<>();

		while (true) {
			System.out.printf("명령어) ");
			String command = sc.nextLine().trim();
			if (command.length() == 0) {
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleId + 1;
				lastArticleId = id;
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();

				Article article = new Article(id, title, body);
				articles.add(article);

				System.out.printf("%d번 글이 생성되었습니다.\n", id);
			} else if (command.equals("article list")) {
				if (articles.size() == 0) {
					System.out.println("게시물이 없습니다.");
					continue;
				}
				System.out.println("번호  /  제목");
				for (int i = articles.size() - 1; i >= 0; i--) {
					Article article = articles.get(i);

					System.out.printf("%d  /  %s\n", article.id, article.title);
				}

			} else if (command.startsWith("article detail ")) {

				String[] commandBits = command.split(" ");
				// 문장을 스플릿하면 자동으로 배열로 바뀐다.
				int id = Integer.parseInt(commandBits[2]);
				// 문장을 숫자로 변환 하는 방법("1"(문장) -> '(숫자))

				Article foundArticle = null;
				// n번글에 대한 정보를 저장하는 곳

				for (int i = 0; i < articles.size(); i++) { // 0 1 2 3 4
					Article article = articles.get(i);

					if (article.id == id) {

						foundArticle = article;
						break;
					}
				}
				if (foundArticle == null) {

					System.out.printf("%d번 게시물은 존재하지 않습니다.\n", id);
					continue;
				} else {
					System.out.printf("번호 : %d\n", foundArticle.id);
					System.out.printf("날짜 : 2021-12-12 12:12:12\n");
					System.out.printf("제목 : %s\n", foundArticle.title);
					System.out.printf("내용 : %s\n", foundArticle.body);
					continue;
				}
			}

			else {
				System.out.printf("%s(은)는 존재하지 않는 명령어입니다.\n", command);
			}
		}

		sc.close();

		System.out.println("==프로그램 끝==");
	}
}

class Article {
	int id;
	String title;
	String body;

	public Article(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
}