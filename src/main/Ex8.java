package main;

public class Ex8 {

	public static void main(String[] args) {
		
		int motherAge = 47;
		int fatherAge = 50;
		
		// 아빠의 나이가 더 많기 때문에 두번째 결과 반환
		String str = (motherAge > fatherAge) ? "엄마" : "아빠";
		System.out.println(str);
		
		
		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch);
		
		int i = (motherAge > fatherAge) ? 1 : 2;
		System.out.println(i);
		
		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);
		
		// 양쪽의 자료형이 일치해야함!!!
	}

}