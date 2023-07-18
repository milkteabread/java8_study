package student;

public class TestStudent {

	public static void main(String[] args) {
		
		Student k = new Student("Kim",100, 90, 95, 89);
		Student l = new Student("Lee",60, 70, 99, 98);
		Student p = new Student("Park",68, 86, 60, 40);
		
		System.out.println(k.getName()+"평균:"+k.getAvg()+" 학점:"+k.getGrade());
		System.out.println(l.getName()+"평균:"+l.getAvg()+" 학점:"+l.getGrade());
		System.out.println(p.getName()+"평균:"+p.getAvg()+" 학점:"+p.getGrade());

		

	}

}
