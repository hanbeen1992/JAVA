package javaClass;

public class Q01Card {
	// 생성자  => 반드시 생성자가 있어야 인스턴스를 만들수 가 있다.
		// 생성자를 만들지 않으면=> 컴파일러가 자동으로 빈 생성자 생성
		int num = 1;
		boolean chk = true;    //   true라면 K가 찍히고, false라면 K가 안찍힌다.
		
		public Q01Card(int num, boolean chk){
			this.num = num;
			// 인스턴스 생성시 입력한 num로 인스턴스 내부의 num필드를 초기화 시켜준다.
			this.chk = chk;
		}
		public Q01Card() {
			
		}
		// 메서드 오버 로딩 
		public String info() {
			String str = "";
			if(chk) {
				str = String.valueOf(num) + "K";
			}else {
//				str = String.valueOf(num);
				//     숫자를 문자열로 변환
				str = num+"";
			}
			return str;
		}

}
