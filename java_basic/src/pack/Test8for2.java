package pack;

public class Test8for2 {

	public static void main(String[] args) {
		System.out.println("countinue, break");
		
		for(int i=1; i<=10; i++) {
			//if(i == 3) continue;
			//if(i == 5) continue;
			if(i == 3 || i == 5) continue; // 조건에 대응되는 for문으로 무조건 이동 3에선 11번째 줄로 내려가지 않고 for로 다시 돌아감
			
			System.out.println(i);
			
			if(i==7) break;
	}
		
		// 무한 반복문 (비권장)
		
		int kk = 0;
		for(;;) {
			kk++;
			System.out.println("kk");
			if(kk==5) break;
		}
		

	}
}
