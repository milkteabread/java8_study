package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <?>
public class GenericsTest3 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("이태용");
		list.add("정재현");
		
		printData(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(95);
		list2.add(97);
		
		printData(list2);
	
	}
	
	public static void printData(List<?> xxx) {
		System.out.println(xxx);
		
	}

}
