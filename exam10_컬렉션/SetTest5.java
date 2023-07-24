package exam10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest5 {

	public static void main(String[] args) {
		
		// Set 계열: 순서가 없고 중복 불가한 자료구조
		
		HashSet<String> set2 =  new HashSet<String>();
		HashSet<String> set1 =  new HashSet<>();
		Set<String> set = new HashSet<>();  //다형성 적용
		
		//가정: 이름만 저장할 것이다
		set.add("이태용");
		set.add("최연준");
		set.add("이재현");
		
		//set의 메서드 정리
		System.out.println("크기:" + set.size());
		System.out.println("값 존재여부:" + set.contains("최연준"));
		System.out.println("값 존재여부:" + set.contains("김영훈"));
		System.out.println("비어있는지:" + set.isEmpty());
		
		set.remove("이재현");  //이재현 삭제
		
		set.clear();  //전체 삭제
		
		//출력방법1 - toString() 이용
		System.out.println(set);
			
		
		
		}
		

	}


