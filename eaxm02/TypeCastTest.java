package exam02;

public class TypeCastTest {

	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		
		//가. byte > short > int > long > float > double,  큰타입 =작은타입;
		byte b = 10;
		short b2 = b; //1바이트 -> 2바이트 변경
		int b3 = b2;  //2바이트 -> 4바이트 변경
		long b4 = b3;
		float f = b4;
		double f2 = f;
		
		//반대 경우는 에러(해결: 강제적 형변환 시키기), 작은타입 = 큰타입;
		float x = 3.14F;
//		int x2 = x;
		
		
		//나. char --> int (아스키코드값)
		char c = 'A';
		char c2 = 'a';
		int n = c;
		int n2 = c2;
		System.out.println(n+" "+n2);
		System.out.println('A'+1); // 문자는 연산이 가능하다	
		
		//다. int보다 작은 데이터형의 연산 int로 반환
		short s = 10;
		short s2 = 10;
//		short s3 = s + s2;  // short = int 형식으로 처리됨		
		
		//라. 큰타입과 작은타입의 연산은 큰타입으로 반환
		float ff = 3.14F;
		int mm = 10;
		float ff2 = ff + mm;

	}

}
