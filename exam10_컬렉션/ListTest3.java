package exam10_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		
		//List계열: 순서가 있고 중복이 가능
		
		List<String> list = new ArrayList<>(); //다형성
		
		list.add("이태용");
		list.add("최연준");
		list.add("이재현");
		list.add("이태용");
		
		//일반적으로 많이 사용하는 방법
		List<String> list2 = Arrays.asList("이태용","최연준","이재현","이태용");
		System.out.println(list2);
		/*
		 *    Arrays API
		 *    1) Arrays.toString(배열);
		 *    2) Arrays.asList(값,값2,값3,...);
		 *    
		 * 
		 */
		
		
		

	}

}
