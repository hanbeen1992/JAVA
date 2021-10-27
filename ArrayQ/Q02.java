package arrQ;

public class Q02 {

	public static void main(String[] args) {
		// 배열에 담긴 값들의 합계를 구하는 프로그램을 작성하세요.
		int[] arr = new int[]{10,15,47,23,51};
		int sum =0;
		for(int k : arr) {
			sum +=k;
		}
		System.out.println("합계 : "+sum);

	}

}
