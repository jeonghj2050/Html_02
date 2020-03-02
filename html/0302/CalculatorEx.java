package test0302;

import java.util.Scanner;

public class CalculatorEx {
	public static void main(String[] args) {
		//키보드로부터 사용자의 입력 값을 받을 수 있는 객체
		//System.in ▶ 키보드 입력
		Scanner scan =new Scanner(System.in);
		int num1=0;
		int num2=0;
		int result=0;
		
		System.out.print("첫 번째 숫자를 입력하세요 ▶");
		//next + Int ▶ nextInt
		num1=scan.nextInt();
		System.out.println("입력된 숫자1 : " + num1);

		System.out.print("두 번째 숫자를 입력하세요 ▶");
		num2=scan.nextInt();
		System.out.println("입력된 숫자2 : " + num2);
		
		System.out.println("============================");
		
		result=num1+num2;
		System.out.println("두 숫자 "+num1+" + "+num2+"의 합은 "+result+"입니다.");
	}

}
