package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		
		//Map은 순서가 없다
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map.put("p1", "이태용");
		map.put("p2", "최연준");
		map.put("p3", "이재현");
		map.put("p3", "김영훈");  //key 중복시 덮어쓴다
		
		
		//메서드
		System.out.println(map.size());
		map.replace("p3","정재현");
		
		map.remove("p3");
		map.clear();  //전체 삭제
		
		//출력방법1 - toString
		System.out.println(map);  
		

			
		}
	}


