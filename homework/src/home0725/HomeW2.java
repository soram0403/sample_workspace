package home0725;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeW2 {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		List<Store> store = new ArrayList<Store>();
		Store str = new Store();
		
		boolean run = true;
		while (run) {
			System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {

			case 1:
				System.out.println("상품 수를 입력하세요.");
				int itemNo = Integer.parseInt(scn.nextLine());
				
				break;
			case 2:
				
					System.out.println("상품을 입력하세요");
					String name = scn.nextLine();
										
					System.out.println("가격을 입력하세요");
					int price = Integer.parseInt(scn.nextLine());
					
					store.add(new Store(name,price));
					
				break;
			case 3:
				for(int i = 0; i< store.size(); i++) {
					System.out.println("제품명: " + store.get(i).name+", 가격: " +store.get(i).price);
								
				}

				break;
			case 4:
				//4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				int max = 0;
				String maxItem = null;
				int sum = 0;
				int others = 0;
				for(int i = 0; i< store.size(); i++) {
					if(store.get(i).price > max) {
						max = store.get(i).price;
						maxItem = store.get(i).name;
					}
					sum += store.get(i).price;
					others = sum = max;
					}
				
				System.out.println("최고 가격을 가지는 제품 : " + maxItem + ", 해당 제품을 제외한 제품들의 총합 : " + others);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
		
	}

	}

