package arrQ;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		//배열과 반복문을 이용해서 프로그램을 작성해보자
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		while(true){
			System.out.print("금액을 입력하시오(나가기:-1) : ");
			Scanner sd = new Scanner(System.in);
			int money = sd.nextInt();
			if(money==-1){
				break;
			}
			for(int i=0;i<unit.length;i++){
				System.out.println(unit[i]+"원 : "+ (money/unit[i]));
				money%=unit[i];
			}
		}
	}

}
