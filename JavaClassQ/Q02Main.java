package javaClass;

public class Q02Main {

	public static void main(String[] args) {
		//다음과 같은 멤버 변수를 가지는 Student클래스를 작성하세요
		Q02Student student1 = new Q02Student();
	    student1.name = "고길동";
	    student1.ban = 3;
	    student1.no = 17;
	    student1.kor = 92;
	    student1.eng = 63;
	    student1.math = 74;
	    
	    System.out.println("이름 : "+student1.name);
	    System.out.println("반 : "+student1.ban);
	    System.out.println("번호 : "+student1.no);
	    System.out.println("총점 : "+student1.getTotal());
	    System.out.println("평균 : "+student1.getAverage());
	    
	    Q02Student student2 = new Q02Student("김유진",5,7,100,67,98);
	    System.out.println("이름 : "+student2.name);
	    System.out.println("반 : "+student2.ban);
	    System.out.println("번호 : "+student2.no);
	    System.out.println("총점 : "+student2.getTotal());
	    System.out.println("평균 : "+student2.getAverage());
	    
	    
	    Q02Student student3 = new Q02Student("고길동",3,17,92,63,74);
		
		student3.info();
	}

}
