package javaClass;

public class Q05Account {
	String accountNum;
	int balance=0;
	String name;
	
	public Q05Account(String accountNum, int balance, String name){	
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	//�Ա�
		public void deposit(int money) {
			System.out.println(money+"�� �Ա��մϴ�.");
			this.balance+=money;
			System.out.println("�ԱݿϷ�");
		}
		
		//���
		 public void withdraw(int money) {
			 System.out.println(money+"�� ����մϴ�.");
			 if(money > balance) {
				 System.out.println("�ܾ� ����");
			 }else {
				 this.balance -= money;
				 System.out.println("��� �Ϸ�");
			 } 
		 }
		
		 // �ܾ� ��ȸ
		 public void checkMyBalance() {
			 System.out.println("�ܾ��� ��ȸ�մϴ�.");
			 System.out.println("�ܾ� : "+this.balance);
		 }
}
