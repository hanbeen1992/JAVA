package javaClass;

public class Q02Main {

	public static void main(String[] args) {
		//������ ���� ��� ������ ������ StudentŬ������ �ۼ��ϼ���
		Q02Student student1 = new Q02Student();
	    student1.name = "��浿";
	    student1.ban = 3;
	    student1.no = 17;
	    student1.kor = 92;
	    student1.eng = 63;
	    student1.math = 74;
	    
	    System.out.println("�̸� : "+student1.name);
	    System.out.println("�� : "+student1.ban);
	    System.out.println("��ȣ : "+student1.no);
	    System.out.println("���� : "+student1.getTotal());
	    System.out.println("��� : "+student1.getAverage());
	    
	    Q02Student student2 = new Q02Student("������",5,7,100,67,98);
	    System.out.println("�̸� : "+student2.name);
	    System.out.println("�� : "+student2.ban);
	    System.out.println("��ȣ : "+student2.no);
	    System.out.println("���� : "+student2.getTotal());
	    System.out.println("��� : "+student2.getAverage());
	    
	    
	    Q02Student student3 = new Q02Student("��浿",3,17,92,63,74);
		
		student3.info();
	}

}
