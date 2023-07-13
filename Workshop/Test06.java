package Workshop02;

public class Test06 {

	public static void main(String[] args) {
		
	  
		// 세개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력		
		int gob = 1;
				
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int k=1; k<=6; k++) {
				  gob = i*j*k;
				  if(gob%3==0) {
				System.out.println(i+"*"+j+"*"+k+"="+gob); 
			  }
		    }
          } 		
		}	   	
	}
}

