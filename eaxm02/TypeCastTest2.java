package exam02;

public class TypeCastTest2 {

	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		
		//가. byte > short > int > long > float > double,  큰타입 =작은타입;	
		//나. char --> int (아스키코드값)
		//다. int보다 작은 데이터형의 연산 int로 반환
		//라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		
		
		//2. 명시적 형변TypeCastTest.java환: (데이터타입) <= 형변환 연산자, 작은타입=(작은타입)큰타입;
		int n =10;
		short n2 = (short)n;

	}

}
