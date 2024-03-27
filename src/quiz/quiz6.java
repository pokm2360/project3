package quiz;

public class quiz6 {

	public static void main(String[] args) {
		// 7이 홀수가 맞는지 확인하고 결과출력
		// 10이 짝수가 맞는지 확인하고 결과출력
		
		int x = 7 % 2;
		boolean result = (x == 1);
		System.out.println(result);
		
		int y = 10 % 2;
		boolean result2 = (y == 0);
		System.out.println(result2);
	}

}
