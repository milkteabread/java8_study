package Workshop03;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		//배열의 합과 평균 구하기
		int [] arr = {10,20,30,40,50};
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0; i<=arr.length; i++) {
			sum += arr[i];		
		}
		avg = sum / (arr.length);
		
		System.out.println("sum:"+sum);
		System.out.println("avg:"+avg);

	}

}
