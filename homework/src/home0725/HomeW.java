package home0725;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
// 1) 메뉴는 다음과 같이 구성하세요.
// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
// 3) 제품별 가격을 출력하세요.
// 출력예시, "상품명 : 가격"
// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
public class HomeW {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Store str = new Store();
	
		
		boolean run = true;
		while (run) {
			System.out.println("1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료");
			System.out.println("선택> ");
			int selectNo = Integer.parseInt(scn.nextLine());

			switch (selectNo) {

			case 1:
				System.out.println("제품명을 입력하세요");
				String itemName = scn.nextLine();
				str.setName(itemName);
				System.out.println("제품의 가격을 입력하세요");
				int price = Integer.parseInt(scn.nextLine());
				str.setPrice(price);
				break;
			case 2:
				str.getName();
				str.getPrice();
				
				break;
			case 3:
				str.maxPriceItem();
				str.sumPrice();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				run = false;
						
			}
		}
		
	}

}
