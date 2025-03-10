package pack;

public class Test10array {

	public static void main(String[] args) {
		// 배열 : 타입(성격과 크기)이 일치하는 여러개의 기억장소(변수)를 대표명 하나만 주고 첨자(색인)로 각 기억장소를 구분, 반복처리에 효과적
		
		// 3과목의 점수의 합 구하기
		
		int kor, eng, mat; // 단순 변수 : 모든 기억장소를 독립적으로 선언
		kor = 90; eng = 80; mat = 100;
		int tot = kor + eng + mat;
		System.out.println("세 과목 점수의 합은 "+tot);
		
		// 배열을 사용해 세과목 점수의 합 구하기

		int jumsu[]= new int[3]; 
		jumsu [0] = 90; jumsu [1] = 80; jumsu [2] = 100;
		int tot2 = 0;
		
		for(int i = 0; i < 3; i++) {
			tot2 = tot2 + jumsu[i];
		}
		
		System.out.println("세 과목 점수의 합은 "+tot2);
		
		System.out.println();
		
		// int ar[]; // 배열로 선언(아직 기억장소를 확보하지 못함)
		
		// ar= new int[5]; //5개의 기억장소가 확보됨
		
		int ar[] = new int[5]; // 대표명 ar인 Int 타입 변수 5개를 선언
		
		System.out.println("배열의 크기 : " +ar.length);
		ar[0] = 10; ar[1] = 20; ar[2]=ar[1]+ar[0];
		System.out.println("ar[2]: " + ar[2]);
		System.out.println("ar[3]: " + ar[3]); // 기본값은 0을 기억
		// System.out.println("ar[3]: " + ar[5]); // ArrayIndexOutOfBoundsException: Index 5 out 오류 발생
		// 배열의 인덱스(첨자)는 0부터 출발
		
		int kbs = 2;
		System.out.println("ar[2]: " + ar[2] + " " + ar[kbs]+ " "+ ar[kbs+1-1]); 
		// 첨자엔 양의 정수만 가능 []안에 연산식 계산도 사용 가능 kbs를 첨자 변수, 색인 변수, index variable 라고 부른다.
		
		// 배열 선언 후 초기값 저장
		
		int ar2[] = {1,2,3,4,5}; // 내부적으로 new를 함

		System.out.println(ar2[0]+" "+ar2[4]);
		
		for(int i = 0; i<ar2.length; i++) { // 배열 요소값 반복문으로 출력
			System.out.print(ar2[i]);
		}
		
		for(int k = 0; k <ar2.length; k++) { // 반복문을 이용해 배열에 값 저장
			ar2[k] = k+10;
		}
		System.out.println();
		for(int k = 0; k <ar2.length; k++) { // 표준 for문으로 배열 출력 반복
			System.out.print(ar2[k]+" ");
		}
		
		// 배열을 이용한 반복처리시 향상된 for를 사용 가능
		System.out.println();
		for(int no:ar2) { // ar2 배열 요소가 차례대로 no에 치환되면서 반복 처리 매우 유용하다 
			System.out.print(no+" ");
		}
		System.out.println();
		double silsu[] = {3.5, 2.1, 6.8};
		for (int i=0; i<silsu.length;i++) {
			System.out.println(silsu[i] + " ");
		}
		
		System.out.println();
		String city[] = {"서울", "제주", "원주"};
		for(int abc=0; abc<city.length;abc++) {
			System.out.print(city[abc]+" ");
		}
		System.out.println();
		for(String ci:city) {
			System.out.print(ci+" ");
		}
		
		System.out.println();
		// 5명의 사람 키(정수)를 배열에 저장하고 평균키 출력
		
		int key[] = {160,166,170,177,180};
		
		int hap = 0;
		
		for(int i =0; i< key.length; i++) {
			hap += key[i];
		}
		double keyavg= (double)hap / key.length; //변수 타입에 따라 오차 발생할 수 있음
		System.out.println(key.length+"명의 키 평균은"+keyavg);
		// key 기억장소는 1차원 배열 : 한 행에 요소(열)로만 구성된 배열
		
		System.out.println();
		// 2차원 배열
		
		int su[][] = new int[3][4]; // 행과 열로 구성된 집합변수 2차원 배열
		
		System.out.println("행의 갯수:"+su.length);
		System.out.println("열의 갯수:"+su[0].length);
		
		su[0][0] = 7; // 2차원 배열 su의 0행 0열에 7을 기억
		System.out.println(su[0][0]);
		
		// 2차원 배열 su에 값 기억
		int num = 10;
		
		for(int i = 0; i<su.length; i++) {
			for(int j = 0; j<su[i].length;j++) {
				su[i][j] = num++;
				System.out.print(su[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// 문제 1 1차원 배열 요소에서 홀수와 짝수의 합 각각 출력
		int arr[] = {1,2,3,4,5,6};
		
		int odds=0,eves=0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				eves += arr[i];
			}else {
				odds += arr[i];
			}
		}
//		향상된 for문을 이용한  처리
//		for(int dig:arr) {
//			if(dig%2==0) {
//				eves += dig;
//			}else {
//				odds += dig;
//			}
//		}
		
		System.out.println("홀수의 합="+odds+ "짝수의 합="+eves);
		
		
		// 문제 2 2차원 배열 요소의 합을 출력
	
		int arr2[][] = {{1,2},{3,4}};
		
		int arrsum = 0;
		
		for(int i = 0; i < arr2.length;i++) {
			for(int j = 0; j < arr2[i].length;j++) {
				arrsum+=arr2[i][j];
			}
		}
//		2차원 배열에 맞는 향상된 for문을 이용한 처리 		
//		for(int[] i:arr2) {
//			for(int j:i) {
//				arrsum += j;
//			}
//		} 
		
		
		
		System.out.println("배열의 요소들의 합"+arrsum);
		
		}	

}

