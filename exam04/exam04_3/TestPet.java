package exan04_3;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c = new Cat("툥냥",2,"수컷");
		
	   //출력1 - 인스턴스 변수 직접 접근
	   System.out.println(c.name);
	   System.out.println(c.age);
	   System.out.println(c.sex); 
	   System.out.println("\n"); 
	   
	   //출력2 - getter 메서드 이용 접근 
	   String name = c.getName();
	   System.out.println(name);	   
	   int age = c.getAge();
	   System.out.println(age);	   
	   String sex = c.getSex();
	   System.out.println(sex);
	   
	   //수정1 - 인스턴스 변수 직접 접근(권장 안함)
	   c.age=3;
	   System.out.println(c.getAge());
	   System.out.println("\n");
	   
	  //수정2 - setter 메서드 이용 수정
	   c.setAge(3);
	   System.out.println(c.getAge());
	   c.setName("잰냥");
	   System.out.println(c.getName());
	   c.sexSex("암컷");
	   System.out.println(c.getSex());
	   
	}

}
