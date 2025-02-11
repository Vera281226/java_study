package pack;

public class Test7switch {
	
	public static void main(String[] args) {
		// switch : 조건판단문의 좀 더 정형화된 문법으로 값에 따라 여러 방향으로 분기하는 경우 효과적
		// 길게 늘어진 if문에 비해 코드가 짧고 의미파악이 쉽다.
		
		int nai = 43;
		nai = nai / 10 * 10;
		//System.out.println(nai);
		
		switch(nai) {
		case 20:
			System.out.println("20대");
			break;
		case 30:
			System.out.println("30대");
			System.out.println("인생의 황금기");
			break;
		default :
			System.out.println("기타");
			break;
		} // break 사용안할시 모두 출력
			
			System.out.println("계속1");
			
			switch(nai) {
			case 10:
			case 20:
				System.out.println("젊음");
				break;
			case 30:
			case 40:
			case 50:
				System.out.println("왕성한 활동");
				break;
			default :
				System.out.println("그 외 기타");
				break;
			} // case 조건: 만을 이용
			
			System.out.println("계속2");
			System.out.println((int)(Math.random()*10)); // Math.random() 0부터 1까지의 난수 발생
			int sigan = (int)(Math.random()* 4) + 8; //8~부터 11사이의 정수 발생
			System.out.println("sigan : " + sigan);
			
			switch (sigan) {
			case 8:
				System.out.println("출근 준비");
				break;
			case 9:
				System.out.println("출근 완료");
				break;
			case 11:
				System.out.println("팀 회의");
				break;
			default:
				System.out.println("개인활동");								
			}
			
			System.out.println("계속3");
			String jik = "과장";
			
			switch (jik) {
			
			case "사원":
				System.out.println("사원 업무");
				break;
			case "과장":
				System.out.println("과장 업무");
				break;
				
			default:
				System.out.println("기타 직급");
				break;
				
			}
		}
	}

