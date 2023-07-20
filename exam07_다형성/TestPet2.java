package exam07;

public class TestPet2 {

	public static void main(String[] args) {
		
	 // 다형성 활용
		
     //1. 배열
		Pet [] pets = {new Cat("툥냥",2),
					   new Dog("빵티즈",1,"수컷"),
			           new Cat("잰냥",1),
			           new Bird("토토",3,"옐로우그린"),
			           new Dog("곰아지",1,"수컷")};
		             
	
	 //이름과 나이만 출력
	for(Pet p: pets) {
		System.out.printf("이름: %s, 나이: %d \n", p.getName(), p.getAge());		
	}
	
	//고양이만 출력 ==> 배열에서 꺼냈을때 누군지 식별하는 방법필요( 변수 instanceof 타입 연산자 )
	for(Pet p: pets) {
		if(p instanceof Cat) {
			System.out.printf("Cat 이름: %s, Cat 나이: %d \n", p.getName(), p.getAge());				
		}
     }
	
	//강아지 이름, 나이, 성별 출력
	for(Pet p: pets) {
		if(p instanceof Dog) {
			
			// Pet 타입 --> Dog 타입
			Dog d = (Dog)p;
			System.out.printf("Dog 이름: %s, Dog 나이: %d \n Dog 성별: %s", d.getName(), d.getAge(), d.getSex());				
		}
     }

  }
}
