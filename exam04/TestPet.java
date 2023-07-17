package exam04;


//Cat과 같은 main이 없는 재사용 클래스 관리목적
public class TestPet {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 변수명 = new 클래스명();
		
		// 고양이: 툥냥 2 수컷
		
		Cat c = new Cat();
		// 멤버 접근
		c.name="툥냥";
		c.age=2;
		c.sex="수컷";
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
		
		// 고양이: 잰냥 1 수컷
		Cat c2 = new Cat();
		c2.name="잰냥";
		c2.age=1;
		c2.sex="수컷";
		System.out.println(c2.name);
		System.out.println(c2.age);
		System.out.println(c2.sex);
		
		

	}

}
