package Workshop02;

public class Test03 {

	public static void main(String[] args) {
		
	  
    // for문을 while문으로 변경	
	//for문
	/*
	for(int i=0; i<=10; i++) {
		for(int j=0; j<=i; j++) {
			System.out.println("*");
			}
		System.out.println();
		}
	*/
		
	//while문 
	int i = 0;
    while(i<=10) {
    	int j = 0;
    	 while(j<=i) {
         System.out.println("*");
         j++;
       }	
    	 System.out.println();
      }
	// 무한 추력 되는데 왜 그러는 건지..!!			
   }
}


