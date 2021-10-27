package javaClass;

public class Q02Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public Q02Student() {}
	
	public Q02Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		int sum =  this.kor+this.eng+this.math;
		return sum;
	}
	
	public float getAverage() {
		float avg = Math.round(getTotal()/3.0f*10)/10.0f; 
//  76.333333 * 10 =>  763.33333
//				  =>  763.0
//				  =>  76.3
//
		return avg;
	}
	
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("반 : "+ban);
		System.out.println("번호 : "+no);
		System.out.println("국어점수 : "+kor);
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}
	
}
