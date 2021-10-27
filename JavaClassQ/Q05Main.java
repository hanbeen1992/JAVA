package javaClass;

import java.util.Scanner;

public class Q05Main {
	static Scanner scan = new Scanner(System.in);
	static Q05Account[] accounts = new Q05Account[100];// 100��� ���¸� ������ �� �ִ� �迭

	
	public static void main(String[] args) {
		boolean run =true;
		
		main:while(run) {
			System.out.println("�׸� ��ũ�� ���Ű��� ȯ���մϴ�.");
			System.out.println("�޴��� ������ �ּ���.");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ����");
			System.out.print("����>");
			
			int selectMenu = Integer.parseInt(scan.nextLine());
			
			switch(selectMenu) {
			case 1: // ���� ���� ���
				System.out.println("���¸� �����մϴ�.");
				System.out.println("������ �̸��� �Է��ϼ���.");
				System.out.print(">");
				String name = scan.nextLine();
				System.out.println("���¹�ȣ�� �Է��ϼ���.");
				System.out.print(">");
				String accountNum = scan.nextLine();
				System.out.println("�ʱ� �Աݾ��� �Է��ϼ���.");
				System.out.print(">");
				int balance = Integer.parseInt(scan.nextLine());
				
				Q05Account newAccount = new Q05Account(accountNum,balance,name);
				
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i]==null) {
						accounts[i]=newAccount;
						break;
					}
				}
				System.out.println("���� ����");
				break;
			case 2: // ���� ����  : �Ա�, ���, ��ȸ
				int chkAccIdx = -1;
				System.out.println("����ϰ��� �ϴ� ���� ��ȣ�� �Է��ϼ���.");
				System.out.print(">");
				String selectAccountNum = scan.nextLine();
				
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i] == null) {
						continue;
					}else if(accounts[i].getAccountNum().equals(selectAccountNum)) {
						chkAccIdx = i;
						break;
					}
				}
				
				if(chkAccIdx == -1) {
					System.out.println("�ش� ���¸� ã���� �����ϴ�.");
				}else {
					bankFunction(chkAccIdx);
				}
				
				break;
			case 3: //����
				System.out.println("���α׷� �����մϴ�.");
//				System.exit(0);
				run = false;
//				return;
//				break main;
				break;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				System.out.println("�ٽ� Ȯ���� �ּ���.");
			}	
		}
	}

	private static void bankFunction(int chkAccIdx) {
		//���� ���¸� ������ ������ ����ϴ� �޼���
		
		while(true) {
			System.out.println(accounts[chkAccIdx].getName()+"�� ȯ���մϴ�.");
			System.out.println("������ �����ϼ���.");
			System.out.println("1. �Ա�");
			System.out.println("2. ���");
			System.out.println("3. �ܾ� ��ȸ");
			System.out.println("0. ���θ޴� ���ư���");
			System.out.print(">");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			int money = 0;
			
			switch(selectNum) {
			case 1://�Ա�
				System.out.println("�Ա� �ݾ��� �Է��ϼ���.");
				money = Integer.parseInt(scan.nextLine());
				accounts[chkAccIdx].deposit(money);
				
				break;
			case 2://���
				System.out.println("��� �ݾ��� �Է��ϼ���.");
				money = Integer.parseInt(scan.nextLine());
				accounts[chkAccIdx].withdraw(money);
				break;
			case 3://��ȸ
				accounts[chkAccIdx].checkMyBalance();
				break;
			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ�.");
				System.out.println("�ٽ� Ȯ���� �ּ���.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
