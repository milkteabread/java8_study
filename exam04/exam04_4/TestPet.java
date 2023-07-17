package exan04_4;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("툥냥",2,"수컷");
		
		System.out.println(c.getAge()); 
		System.out.println(c.getName());		   
		System.out.println(c.getSex());
		System.out.println("\n");
		
		
		//수정1 - 개별적으로 하나씩 수정
		c.setName("잰냥");
		c.setAge(1);
		
		System.out.println(c.getAge()); 
		System.out.println(c.getName());
		System.out.println(c.getSex());
		System.out.println("\n");
		
		//수정2 - 한꺼번에 수정
		c.setCat("복둥", 3);
		System.out.println(c.getName()); 
		System.out.println(c.getAge());
		System.out.println(c.getSex());
		System.out.println("\n");
		
		//getCat 호출
		String result = c.getCat("티와이", 4, "수컷");
		System.out.println(result);
		
		
		//////////////////////////////////
		c.xxx();
		
		System.out.println("end");
		
		/////////////////////////////////
		c.yyy(10);
		

	}

}
