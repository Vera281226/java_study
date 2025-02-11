package mypack;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDto {
	
	ArrayList<StudentData> list = new ArrayList<StudentData>();
	private Scanner input;
	
	
	public void insertData() {
		StudentData student = null;
		
		while(true){
			input = new Scanner(System.in);

			
				student = new StudentData();
				System.out.print("이릅 입력 : ");		
				student.setName(input.next());			
				System.out.print("\n국어 점수 입력 : ");
				student.setKor(input.nextInt());
				System.out.print("\n영어 점수 입력 : ");
				student.setEng(input.nextInt());
				list.add(student);
				System.out.print("\n계속할까요?(y/n)?");

				String out = input.next();
				if(out.equals("n"))  // 문자열 비교 조건 축약
					break;			
				
			}
		}
	public void showData() {
		for(int i=0; i<list.size();i++) {
			StudentData studentDto = new StudentData();
			studentDto = list.get(i);
			System.out.println(studentDto.getName()+" "+studentDto.getKor()+" "+studentDto.getEng());
		}		
	}
	
	public static void main(String[] args) {
		
		StudentDto dto = new StudentDto();
		dto.insertData();
		dto.showData();
	}
}

