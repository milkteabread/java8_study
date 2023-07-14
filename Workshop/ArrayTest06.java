package Workshop03;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		//Scanner 클래스 사용하여 height값 입력받고 최대값 구하기
		//입력받은 사람 수만큼 배열 생성하여 사용
		System.out.println("키를 입력하시오");
		Scanner scan  = new Scanner(System.in); 
		int height = scan.nextInt();
		
		int[] h = new int[height];
		System.out.println("사람 수:"+ h.length);
		
		for(int i=1; i<h.length; i++) {
			System.out.println("사람"+i+":"+ h[i]);
			h[i] = scan.nextInt();
		}
		
		// 초기 최댓값은 배열 첫번째값으로 설정
		int max = h[0];
		for(int i=1; i<h.length; i++) {
			if(max<h[i]) { // 설정된 최댓값보다 큰값 발견시 값 변경
				max = h[i];
			}
		}	
		System.out.println("키의 최댓값을 구합니다.");	
		
		System.out.println("최댓값은"+ max+"입니다");

	}

}
