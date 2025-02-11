package pack2;

public class Ex3Student {
	
	private String name;
	private int grade;
	private double score;
	
	public Ex3Student(String name, int grade, double score) {
		//생성자
		this.name = name;
		this.grade = grade;
		this.score = score;
	}
	
	public void printStudentInfo(){
		System.out.println("이름 : ["+name+"], 학년 : ["+grade+"], 평균 점수 : ["+score+"]");

	}
	
	public void setScore(double score) { // setter를 이용해 점수 값만 변경
		this.score=score;
		
	}
	
	//	public void changeStudentInfo(String name, int grade, double score) { // 객체 정보 전체 변경 메소드
//		this.name = name;
//		this.grade = grade;
//		this.score = score;
//	}
	
}
