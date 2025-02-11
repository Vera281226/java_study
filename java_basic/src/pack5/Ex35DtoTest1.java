package pack5;

import java.util.ArrayList;

public class Ex35DtoTest1 {

	ArrayList<Ex35Student> list = new ArrayList<Ex35Student>(); // List를 정보 기억 장소로 사용
	
	// DTO 사용 전 방식
	
	public void aa() {
		String persons[] = new String[3]; // 사람 이름을 기억하기 위한 배열
		persons[0] = "홍길동";
		persons[1] = "나길동";
		persons[2] = "고길동";

		for(String s:persons) System.out.println(s);		
	}
	public void insertData() { // DTO 저장 메소드
		Ex35Student student = null;
		
		student = new Ex35Student(); // DTO 객체 생성
		student.setHakbun("acorn1");
		student.setIrum("홍길동");
		student.setJumsu(90);
		list.add(student);  // DTO 기억 장소에 객체 정보 저장
		
		student = new Ex35Student(); // DTO 객체 초기화
		student.setHakbun("acorn2"); 
		student.setIrum("나길동");
		student.setJumsu(88);
		list.add(student); // 초기화된 객체에 정보를 채우고 기억 장소의 다른 공간에 저장시킨다.
		
		student = new Ex35Student(); 
		student.setHakbun("acorn3");
		student.setIrum("고길동");
		student.setJumsu(100);
		list.add(student);
		
		System.out.println(list);		
	}
	public void showData() {
		System.out.println("list 크기 : "+list.size());
		System.out.println("첫번째 학생 정보 : "+list.get(0));
		System.out.println("첫번째 학생 정보 : "+list.get(1));
		System.out.println("첫번째 학생 정보 : "+list.get(2).getHakbun()+list.get(2).getIrum()+list.get(2).getJumsu());
		// 반복문을 사용하여 컬렉션에 저장된 DTO의 내용 출력
		for(int i=0; i<list.size();i++) {
			Ex35Student studentDto = new Ex35Student(); // ??
			studentDto = list.get(i);
			System.out.println(studentDto.getHakbun()+" "+studentDto.getIrum()+" "+studentDto.getJumsu());
			// System.out.println(list.get(i).getHakbun());
		}
	}

	public static void main(String[] args) {
		Ex35DtoTest1 test1 = new Ex35DtoTest1();
		test1.aa();
		
		test1.insertData();
		
		System.out.println("학생 자료 저장 후 딴짓을 하다가 문득 학생자료 찍기");
		test1.showData();
		
	}
}
