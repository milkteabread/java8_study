package exam04_1;

public class TestPet {

	public static void main(String[] args) {
		
		// 고양이: 툥냥 2 수컷
		
		//생성자 이용하여 값 초기화
		Cat c = new Cat("툥냥", 2,"수컷");
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);

	}

}
