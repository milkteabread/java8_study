package exam06;

public class Bird {
	
	String name;
	int age;
	String color;
	
	public void eat() {
		System.out.println("새 먹기");
	}
	public void sleep() {
		System.out.println("새 자기");
	}
	public void fly() {
		System.out.println("새 날기");
	}
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	public Bird(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
