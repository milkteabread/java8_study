package Workshop02;

public class Test04 {

	public static void main(String[] args) {
		
	  
    // 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 경우의수 출력		
		int sum = 0;
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				sum = i+j;
				if(i+j==6) {
			 System.out.println(i+"+"+j+"="+sum); 
			 }
		  }			
		}
	}
}

