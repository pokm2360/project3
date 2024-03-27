package quiz;

public class quiz5 {

	public static void main(String[] args) {
		// 1. 본인의 나이가 40세 이하라면 true 출력
		// 2. 본인의 나이가 40세가 맞다면 true 출력
		// 3. 본인의 나이가 40세가 아니라면 true 출력

		int age = 35;
		boolean result1 = (age <= 40);
		System.out.println(result1);
		
		
		boolean result2 = (age == 40);
		System.out.println(result2);
		
		
		boolean result3 = (age != 40);
		System.out.println(result3);
	}

}
