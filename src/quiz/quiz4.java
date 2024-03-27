package quiz;

public class quiz4 {

	public static void main(String[] args) {
		// 수학, 영어, 국어의 점수가 각각 90, 70, 100일때
		// 총점, 평균 구하기
		int math = 90;
		int eng = 70;
		int lan = 100;
		
		int total = math + eng + lan;
		System.out.println("총점: "+ total);
		double avg = (math + eng + lan) / 3.0;
		System.out.println("평균: "+ avg);
	}

}
