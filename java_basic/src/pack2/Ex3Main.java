package pack2;

public class Ex3Main {

	public static void main(String[] args) {
		Ex3Student student1 = new Ex3Student("강아지",3,88.88); // 학생 객체 생성 
	       
        student1.printStudentInfo(); // printStudentInfo() 호출

		
		Ex3Student student2 = new Ex3Student("홍길동",4,77.77);
		student2.printStudentInfo();
	}

}
