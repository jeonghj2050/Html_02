package test0302;

public class Hello {
	public static void main(String[] args) {
		//코드는 기본적으로 ;으로 줄을 구분
		//이것은 한 줄 주석
		/*
		 *	이것은 여러 줄 주석입니다. 
		 */
		
		/*
		 * 데이터의 종류
		 * 1.숫자
		 * 		1.1) 정수(Integer) - 소수점이 없는 숫자
		 * 		1.2) 실수(Float) - 소수점이 있는 숫자(부동소수점)
		 * 2.문자(Character)
		 * 3.문자열(String)
		 * 4.진리값(True,1|False,0)
		 */
		
		/*
		 * 메모리에서 모든 프로그램은 동작함.
		 * 데이터도 모두 메모리에 저장 되어야 함.
		 * 데이터를 저장하는 공간을 '변수'라함. 
		 */
		
		/*
		 * 자료형의 종류
		 * 1. 진리값 자료형 : boolean형 								▶ 1bit
		 * 1-1. 바이트 자료형 : byte										▶ 1byte
		 * 2. 문자 자료형 : char형 											▶ 2byte
		 * 3. 정수 자료형 : int, short, long, long long형 			▶ 4byte, 2byte, 4byte, 8byte 
		 * 4. 실수 자료형 : float, double, long double형			▶ 4byte, 8byte, 16byte 
		 * 5. 참조 자료형 : String형	 									
		 */
		
		/*
		 * 프로그램을 작성 할 때 해야 할 일
		 *  1.프로그램은 메모리에서 동작함
		 *  		▶ 데이터를 처리할 공간이 필요하다.
		 *  		▶ 해당 데이터의 변수를 만들어야 한다.
		 */
		
		/*
		 * 변수를 만드는 방법
		 * 		- 자료형 자료이름;		▶ 변수 선언
		 * 		- 자료이름 = 값			▶ 변수 초기화
		 */
		
		// 변수 선언 및 초기화 ▶ 초기화 하지 않으면 사용 불가
		//=은 대입 연산자로 우측 값을 좌측에 대입한다.
		boolean b=false; //false=0, true=0이 아닌 값
		byte bb=0;
		char ch = '\0'; //'\0'는 null문자(빈 공간)이다.
		short st=0;
		int i=0;
		long l=0L;
		float f=0.0f;
		double d=0.0f;
		
		String str="";	//공백 출력
		String str2=new String(""); //공백 출력
		String str3=null;	//null 출력
		
		System.out.println(str+"1");
		System.out.println(str2+"2");
		System.out.println(str3+"3");
		//표준 출력하는 메소드를 사용해 "hello~이름"을 출력한다.
		System.out.println("Hello~!Hyojin~^^");
		
		//줄바꿈 1번 (문자열 내부에 \n사용)
//		System.out.print("자기소개 프로그램\n");
		//줄바꿈 2번 (println()메소드를 사용하여 출력)
		System.out.println("자기소개 프로그램");
		System.out.println("===========================");
		System.out.println("이름 : 정효진");
		System.out.println("나이 : 23");
		System.out.println("취미 : 게임");
		System.out.println("주량 : 못마셔요~^^");
		System.out.println("===========================");
		
		//printf(형식지정,값) 사용
		//%d : 정수, %f : 실수, %c : 문자, %s  : 문자열
		System.out.printf("%.2f + %d = %.2f %s",1.5,2,1.5+2,"입니다~~");
	}
}
