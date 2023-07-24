package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {

	public static void main(String[] args) {
		
		// Set 계열: 순서가 없고 중복 불가한 자료구조
		
		HashSet<String> set =  new HashSet<>();
		
		//가정: 이름만 저장할 것이다
		set.add("이태용");
		set.add("최연준");
		set.add("이재현");
		
//		set.add(10);
		
		//출력방법1 - toString() 이용
		System.out.println(set);
		
		//출력방법2 - foreach문 이용	
		for (String obj : set) {  // 다형성
//			String str = (String)obj;
			System.out.println(">>" + obj.concat(" 님"));
			}
		
		//출력방법3 - Iterator 이용 ==>
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println("$$" + str);
			} 
		/*
		 * 제네릭스를 쓰면
		 * 1) 잘못된 데이터를 저장한 것을 컴파일 시점에 알 수 있다
		 * 2) 무조건 형변환 필요 없다
		 */
		
		}
		

	}


