package Workshop02;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
	  
		// 입력받은 한자리 정수형 데이터의 배수합 구하기		
		
		
		// 정수값 키보드로 입력받기
	    System.out.println("한자리 정수값을 입력하시오");
		Scanner scan  = new Scanner(System.in); 
		int num = scan.nextInt(); 
		
		int sum = 0;
		// 1부터 100까지 숫자 중 입력받은 수의 배수만 더하기
		for(int i=1; i<=100; i++) {
		  if(i%num==0) {
			sum += i;
			if(i!=num)
			System.out.print("+");
			System.out.println(i);
	   	}		 
      }	   	
		 System.out.println("="+sum);
		 // 출력이 세로로 됨...
    }
}
