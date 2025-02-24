package pack3lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStream {
	
	public MyStream() {
		test1(); // Stream 생성
		test2(); // List에 스트림 적용
		test3(); // Dto 사용
	}
	// 스트림 API를 사용하려면 스트림을 생성해야함
	private void test1() {
		// 컬렉션 인터페이스는 stream()이 정의되어있다.  컬렉션을 구현한 객체(List, Set ...)는 이를 이용해 스트림 생성 
		
		//List로 스트림 생성하기
//		List<String> list = Arrays.asList("a","b","c");
//		Stream<String> liststream = list.stream();
		
		// 배열로 스트림 생성하기
//		Stream<String> arraystream = Stream.of("a","b","c");
//		Stream<String> arraystream2 = Stream.of(new String[] {"a","b","c"});
//		Stream<String> arraystream3 = Arrays.stream(new String[] {"a","b","c"},0,3); 
		// 시작 인덱스 0 부터 시작 끝 인덱스 3 전(2)까지의 배열 요소를 포함한 스트림 반환
		
		// 원시 자료형 스트림 생성
		IntStream iStream = IntStream.range(5, 10);
//		int hap = 0;
		iStream.forEach(para -> {System.out.println(para+" ");});
		}
		
	private void test2() {
		List<String> list = Arrays.asList("레밍스", "팩맨", "마리오");
//		list.add("소닉"); // java.lang.UnsupportedOperationException : 배열을 리스트로 변환해서 리스트가 아님 기존 요소 추가, 삭제 불가

		Iterator<String> iter = list.iterator(); // 전통적인 방법 : 외부 반복자를 사용
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(String ss:list) {System.out.println(ss);}
		
		Stream<String> stream = list.stream(); // Stream의 객체 얻기(람다로 처리 가능한 반복자 역할)
		stream.forEach(str -> System.out.println(str)); // 내부반복으로 처리됨
//		stream.forEach(str -> System.out.println(str)); // java.lang.IllegalStateException 스트림은 1회용이다.
		list.stream().forEach(System.out::println); // 메소드 참조 연산 : 매개변수를 출력할때 사용 가능
	
		// 스트림을 사용해 체이닝 작업 수행 : 여러 작업을 단일 스트림 파이프라인으로 처리
		int sum = IntStream.of(1,3,5,7,9).peek(System.out::println).sum(); // 내용 출력과 합 계산 동시 수행 
		System.out.println("합은 : "+sum);	
		
//		list.stream().peek(System.out::println).forEach(System.out::println);
		
		// 병렬 처리
		// .parallelStream : 스트림을 병렬로 처리하여 대량의 자료 출력에 유용, 내부 스레드 사용, 작업 처리 시간 단축 가능
		// 다중 스레드처럼 순서가 없이 처리된다
		Stream<String> streamPar =list.parallelStream();
		streamPar.forEach(ss -> System.out.println(ss));
		
		// 정렬 - 기본 오름차순
		Stream<String> streamSort = list.stream().sorted();
		streamSort.forEach(System.out::println);
		Stream<String> streamSortReverse = list.stream().sorted(Comparator.reverseOrder());
		streamSortReverse.forEach(System.out::println);
		
	};
	
	private void test3() {
		// 학생 타입의 DTO클래스로 컬렉션 작성
		List<Student> slist=Arrays.asList(
				new Student("한국인","남",22),
				new Student("한사람","남",21),
				new Student("마리아","여",28),
				new Student("남한인","남",22),
				new Student("마리오","여",32));
		Stream<Student> stream = slist.stream();
		stream.forEach(p -> System.out.println(p.getName()+" "+p.getGender()+" "+p.getAge()));
		// 스트림 활용 - 평균 출력
		double avg = slist.stream().mapToInt(Student::getAge)
				.average().getAsDouble(); // age 평균을 Optionaldouble 타입(Null 회피)으로 저장
		// Student 객체를 age 값으로 매핑 age로 스트림 생성
		System.out.println("학생 나이 평균 : "+(int)avg);
		
		// 평균 출력 2
		double avg2 = slist.stream().collect(Collectors.averagingDouble(Student::getAge));
		System.out.println("학생 나이 평균 : "+(int)avg2);
		
		// 평균 출력 3
		OptionalDouble result = slist.stream().mapToDouble(Student::getAge).average();
		result.ifPresent(res->System.out.println("학생 나이 평균 : "+res)); // null 값 회피
		
		// 필터 처리
		double avgResult = slist.stream().filter(d->d.getGender().equals("남"))
				.mapToDouble(Student::getAge).average().getAsDouble();
		System.out.println("남학생 나이 평균 : "+avgResult);
		
		// 스트림을 통한 필터링 SQL문 쓰는것 같다
		slist.stream().filter(name->name.getName().startsWith("한")).forEach(i->System.out.println(i.getName()));;

	}
	
	
	class Student{
		private String name, gender;
		private int age;
		
		public Student(String name, String gender, int age) {
			this.name=name;
			this.gender=gender;
			this.age=age;
		}
		public String getName() {return name;}
		public String getGender() {return gender;}
		public int getAge() {return age;}
		
		public void setName(String name) {this.name = name;}
		public void setGender(String gender) {this.gender = gender;}
		public void setAge(int age) {this.age = age;}
}
	
	public static void main(String[] args) {
		new MyStream();
	}
}
