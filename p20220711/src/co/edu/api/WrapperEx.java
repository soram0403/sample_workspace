package co.edu.api;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);

		int i2 = 100;

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 100(int) => 100(Integer) 박싱.
		list.add(200);
		list.add(new Integer(300)); // deprecated 된것. 차후 사용중지.

		for (Integer num : list) {   // for (int num : list) 도 가
			System.out.println(num);
		}
		
		// 문자열 => 숫자.
		int n1 = Integer.parseInt("1000");
		double n2 = Double.parseDouble("23.3");
	}
}
