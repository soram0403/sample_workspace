package co.edu.interit.friend;

import java.util.Scanner;

/*
 *  등록, 조회, 목록
 */
public class FriendApp {
	// 생성자: 기본생성자.

	Friend[] friends = new Friend[10];
	int friendNum;
	Scanner scn = new Scanner(System.in);

	public void start() {
		while (true) {
//			System.out.println("1.등록 2.조회 3.목록 9.종료");
			timerShow("1.등록 2.조회 3.목록 9.종료");
			System.out.println("선택> ");
			int selectNo = 0;

			try {
				selectNo = Integer.parseInt(scn.nextLine()); // "가" -> 12
			} catch (Exception e) {
				System.out.println("1, 2, 3번 중에 선택하세요.");
			}

			if (selectNo == 1) {
				add();
			} else if (selectNo == 2) {
				search();
			} else if (selectNo == 3) {
				list();
			} else if (selectNo == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("프로그램을 종료.");
	} // end of start

	private void add() {
		int choice = 0;

		while (true) {
			System.out.println("1.학교 2.회사 3.친구");
			System.out.println("선택> ");
			try {
				choice = Integer.parseInt(scn.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("1, 2, 3번 중에 선택하세요.");
			}

		}
		System.out.println("이름> ");
		String name = scn.nextLine();
		System.out.println("연락처> ");
		String phone = scn.nextLine();

		if (choice == 1) {
			System.out.println("학교이름> ");
			String univ = scn.nextLine();
			System.out.println("전공> ");
			String major = scn.nextLine();

			friends[friendNum++] = new UnivFriend(name, phone, univ, major);

		} else if (choice == 2) {
			System.out.println("회사이름> ");
			String company = scn.nextLine();
			System.out.println("부서> ");
			String department = scn.nextLine();

			friends[friendNum++] = new ComFriend(name, phone, company, department);

		} else if (choice == 3) {
			friends[friendNum++] = new Friend(name, phone);
		}
	}

	// 상세조회
	private void search() {
		System.out.println("친구이름> ");
		String searchName = scn.nextLine();
		for (int i = 0; i < friendNum; i++) {
			if (searchName.equals(friends[i].getName())) {
				friends[i].showInfo();
			} else {
				System.out.println("찾을 수 없습니다.");
			}
		}

	}
	
	private void list() {
		for (int i = 0; i < friendNum; i++) {
			System.out.println(friends[i].toString());
		}
	}
	
	private void timerShow(String msg) {
		String[] message = msg.split("");
		for (int i =0; i<message.length; i++) {
			System.out.print(message[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
