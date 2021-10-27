package arrQ;

public class Q07 {

	public static void main(String[] args) {
		// 배열에 담긴 숫자를 읽어서 숫자만큼 *을 찍는 프로그램을 완성하세요.
		int[] arr = new int[]{3,2,5};

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
