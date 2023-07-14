package Workshop03;

import java.util.Scanner;

public class ArrayTest08 {

	public static void main(String[] args) {
		
		//최대값과 최소값 구하기
		
		int [] score = {99,34,67,22,11,9};
		
		int max = score[0];
		for(int i =0; i<score.length; i++) {
			if(max<score[i]) { 
				max = score[i];
			}
		}
		
		int min = score[0];
		for(int i =0; i<score.length; i++) {
			if(min>score[i]) { 
				min = score[i];
			}
		}
        System.out.println("최대값:"+max);	
		System.out.println("최소값:"+ min);
		
	}

}
