package quiz;

public class quiz8 {

	public static void main(String[] args) {
		// 1. int형 변수 x를 선언하고 80 대입
		// x가 50<x<100 범위에 포함되는지 확인하고 결과 출력
		
		// 2. int형 변수 y 선언, 5 대입
		// y가 10보다 작거나 30보다 큰지 확인하고, 결과 출력
		
		int x = 80;
		int y = 5;
		
		boolean result1 = x > 50 && x < 100;
		boolean result2 = y < 10 || y > 30;
		
		System.out.println(result1);
		System.out.println(result2);

	}

}
