package test0302;

import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		//Ű����κ��� ������� �Է� ���� ���� �� �ִ� ��ü
		//System.in �� Ű���� �Է�
		Scanner scan =new Scanner(System.in);
		int num1=0;
		int num2=0;
		int result=0;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� ��");
		//next + Int �� nextInt
		num1=scan.nextInt();
		System.out.println("�Էµ� ����1 : " + num1);

		System.out.print("�� ��° ���ڸ� �Է��ϼ��� ��");
		num2=scan.nextInt();
		System.out.println("�Էµ� ����2 : " + num2);
		
		System.out.println("============================");
		
		result=num1+num2;
		System.out.println("�� ���� "+num1+" + "+num2+"�� ���� "+result+"�Դϴ�.");
	}

}
