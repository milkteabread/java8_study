package Workshop03;

public class ArrayTest03 {

	public static void main(String[] args) {
		
		//2차원 배열에 담긴 모든 값의 총합과 평균 구하기
		int [][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{ 10, 10, 10, 10, 10},
				{ 20, 20, 20, 20, 20},
				{ 30, 30, 30, 30, 30},
	        	};
				
		int sum = 0;
		float avg = 0;
		
		int count = 0;
		for(int i=0; i<arr2.length; i++) { 
			for(int j=0; j<arr2[i].length; j++) { 
				sum += arr2[i][j];
				count += 1;
			}
		}		
        avg = sum / count;
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);
		

	}

}
