package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		//Map은 순서가 없다
		HashMap<String, String> map = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map.put("p1", "이태용");
		map.put("p2", "최연준");
		map.put("p3", "이재현");
		map.put("p3", "김영훈");  //key 중복시 덮어쓴다
		
		//출력방법1 - toString
		System.out.println(map);  //{p1=이태용, p2=최연준, p3=이재현}
		
		//출력방법2 - get(key)
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("x"));  //key가 없으면 null 반환
		
		//출력방법3 - keySet() ==> key값을 반환(주로 key가 많을 때)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
			
		}
	}

}
