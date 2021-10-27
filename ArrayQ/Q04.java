package arrQ;

public class Q04 {

	public static void main(String[] args) {
		//1과9사이의 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램을 완성하세요. 
        //단, 숫자의 중복이 있어서는 안됩니다.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] number = new int[3];
		for(int i=0;i<ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j]=tmp;
		}
		System.arraycopy(ballArr,0, number,0,3);
		for(int i=0; i<3;i++) {
			System.out.print(number[i]);
		}
	}
}
