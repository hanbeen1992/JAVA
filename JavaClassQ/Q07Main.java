package javaClass;

import java.util.Scanner;

public class Q07Main {

	public static void main(String[] args) {
		//Q07 ����
		Scanner sc = new Scanner(System.in);   
		   System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Q07Grade me = new Q07Grade(math, science, english);
		   System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����   
		   sc.close();
	}
}

