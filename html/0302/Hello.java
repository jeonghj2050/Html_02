package test0302;

public class Hello {
	public static void main(String[] args) {
		//�ڵ�� �⺻������ ;���� ���� ����
		//�̰��� �� �� �ּ�
		/*
		 *	�̰��� ���� �� �ּ��Դϴ�. 
		 */
		
		/*
		 * �������� ����
		 * 1.����
		 * 		1.1) ����(Integer) - �Ҽ����� ���� ����
		 * 		1.2) �Ǽ�(Float) - �Ҽ����� �ִ� ����(�ε��Ҽ���)
		 * 2.����(Character)
		 * 3.���ڿ�(String)
		 * 4.������(True,1|False,0)
		 */
		
		/*
		 * �޸𸮿��� ��� ���α׷��� ������.
		 * �����͵� ��� �޸𸮿� ���� �Ǿ�� ��.
		 * �����͸� �����ϴ� ������ '����'����. 
		 */
		
		/*
		 * �ڷ����� ����
		 * 1. ������ �ڷ��� : boolean�� 								�� 1bit
		 * 1-1. ����Ʈ �ڷ��� : byte										�� 1byte
		 * 2. ���� �ڷ��� : char�� 											�� 2byte
		 * 3. ���� �ڷ��� : int, short, long, long long�� 			�� 4byte, 2byte, 4byte, 8byte 
		 * 4. �Ǽ� �ڷ��� : float, double, long double��			�� 4byte, 8byte, 16byte 
		 * 5. ���� �ڷ��� : String��	 									
		 */
		
		/*
		 * ���α׷��� �ۼ� �� �� �ؾ� �� ��
		 *  1.���α׷��� �޸𸮿��� ������
		 *  		�� �����͸� ó���� ������ �ʿ��ϴ�.
		 *  		�� �ش� �������� ������ ������ �Ѵ�.
		 */
		
		/*
		 * ������ ����� ���
		 * 		- �ڷ��� �ڷ��̸�;		�� ���� ����
		 * 		- �ڷ��̸� = ��			�� ���� �ʱ�ȭ
		 */
		
		// ���� ���� �� �ʱ�ȭ �� �ʱ�ȭ ���� ������ ��� �Ұ�
		//=�� ���� �����ڷ� ���� ���� ������ �����Ѵ�.
		boolean b=false; //false=0, true=0�� �ƴ� ��
		byte bb=0;
		char ch = '\0'; //'\0'�� null����(�� ����)�̴�.
		short st=0;
		int i=0;
		long l=0L;
		float f=0.0f;
		double d=0.0f;
		
		String str="";	//���� ���
		String str2=new String(""); //���� ���
		String str3=null;	//null ���
		
		System.out.println(str+"1");
		System.out.println(str2+"2");
		System.out.println(str3+"3");
		//ǥ�� ����ϴ� �޼ҵ带 ����� "hello~�̸�"�� ����Ѵ�.
		System.out.println("Hello~!Hyojin~^^");
		
		//�ٹٲ� 1�� (���ڿ� ���ο� \n���)
//		System.out.print("�ڱ�Ұ� ���α׷�\n");
		//�ٹٲ� 2�� (println()�޼ҵ带 ����Ͽ� ���)
		System.out.println("�ڱ�Ұ� ���α׷�");
		System.out.println("===========================");
		System.out.println("�̸� : ��ȿ��");
		System.out.println("���� : 23");
		System.out.println("��� : ����");
		System.out.println("�ַ� : �����ſ�~^^");
		System.out.println("===========================");
		
		//printf(��������,��) ���
		//%d : ����, %f : �Ǽ�, %c : ����, %s  : ���ڿ�
		System.out.printf("%.2f + %d = %.2f %s",1.5,2,1.5+2,"�Դϴ�~~");
	}
}
