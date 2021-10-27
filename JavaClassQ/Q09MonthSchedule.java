package javaClass;

import java.util.Scanner;

public class Q09MonthSchedule {
	private Scanner sc =new Scanner(System.in);
	   private Q09Day days[];
	   
	   Q09MonthSchedule(int day) {
	      this.days = new Q09Day[day];
	      for(int i=0; i<days.length; i++) {
	         days[i] = new Q09Day();
	      }
	      sc = new Scanner(System.in);
	   }
	   private void input() {
	      System.out.print("��¥(1~30)?");
	      int day = sc.nextInt();
	      System.out.print("����(��ĭ�����Է�)?");
	      String work = sc.next();
	      day--;
	      if(day < 0 || day > 30) { 
	         System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	         return;
	      }
	      days[day].set(work);
	   }
	   private void view() {
	      System.out.print("��¥(1~30)?");
	      int day = sc.nextInt();
	      day--;
	      if(day < 0 || day > 30) { // 0~29
	         System.out.println("��¥�� �߸� �Է��Ͽ����ϴ�.");
	         return;
	      }
	      System.out.print((day+1)+"���� �� ���� ");
	      days[day].show();
	   }
	   private void finish() {
	      System.out.println("���α׷��� �����մϴ�.");
	      sc.close();
	   }
	   public void run() {
	      System.out.print("�̹��� ������ ���� ���α׷�.");
	      while(true) {
	         System.out.println();
	         System.out.print("����(�Է�:1, ����:2, ������:3) >>");
	         int select = sc.nextInt();
	         switch(select) {
	         case 1: input(); break;
	         case 2: view(); break;
	         case 3: finish(); return;
	         }
	      }
	   }
}