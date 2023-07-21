package exam08_1;

import java.util.Arrays;

public class StringTest2 {

	public static void main(String[] args) {
		
		// 메서드 
		String s = "HeLLo";
		// String 클래스의 인스턴스 메서드
		
		System.out.println("1.문자열 길이:"+s.length());
		char c = s.charAt(1);
		System.out.println("2.특정 문자 얻기:"+s.charAt(0));
		System.out.println("2.특정 문자 얻기:"+c);
		
		System.out.println("3.특정 문자 위치:"+s.indexOf('e'));
		System.out.println("3.특정 문자 위치:"+s.indexOf('T')); //없으면 -1
		
		System.out.println("4.대문자:"+s.toUpperCase());
		System.out.println("5.소문자:"+s.toLowerCase());
		
		System.out.println("6.문자열 연결:"+s.concat(" ~~~"));
		
		System.out.println("7.부분열:"+s.substring(1)); //1부터 끝까지
		System.out.println("7.부분열:"+s.substring(1,4)); //1~3
		
		System.out.println("8.문자열  포함여부:"+s.contains("Y"));
		System.out.println("8.문자열  포함여부:"+s.contains("H"));
		
		System.out.println("9.문자열 치환:"+s.replace("e", "X")); 
		
		System.out.println("10.문자열 비교(대소문자무시):"+s.equals("hello"));
		
		String s2 = "     world     ";
		System.out.println("11.공백제거:"+s2.trim());
		System.out.println("11.공백제거:"+s2.trim().length());
		
		//구분자로 분리 ==> 배열로 반환
		String s3 = "AAA/BBB/CCC";
		String [] arr = s3.split("/");
		System.out.println("12.구분자로 분리:"+Arrays.toString(arr));
		
		
		// String의 static 메서드
		
		
	}

}
