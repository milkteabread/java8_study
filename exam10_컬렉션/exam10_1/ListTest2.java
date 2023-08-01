package exam10_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		//List계열: 순서가 있고 중복이 가능
		
		ArrayList<String> list2 = new ArrayList<>();
		
		List<String> list = new ArrayList<>(); //다형성
		
		list.add("이태용");
		list.add("최연준");
		list.add("이재현");
		list.add("이태용");
		
		//메서드 정리
		System.out.println("크기:" + list.size());
		
		//수정
		list.set(2, "김영훈");
		
		//삽입
		list.add(0, "이재현");
		
		//삭제
		list.remove(1); //위치로 삭제
		list.remove("김영훈"); //값으로 삭제
		
		//부분리스트
		List<String> subList = list.subList(0, 2); //0~1
		System.out.println(subList);
		
		//출력방법1 - toString() 이용
		System.out.println(list);
		
		
		
		

	}

}
