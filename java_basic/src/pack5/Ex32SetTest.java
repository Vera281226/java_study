package pack5;

import java.util.HashSet;
//import java.util.Iterator;

/* Collection : 객체를 담을 수 있는 기억장소
 많은 수의 데이터를 그 사용 목적에 적합한 자료구조를 묶어 하나로 그룹화한 객체
컬렉션의 종류는 ArrayList, LinkedList, Vector, Stack, HashSet, TreeSet, HashMap, TreeMap
List : 이름과 같이 목록처럼 데이터를 순서에 따라 관리합니다. 
Set : 중복이 허용되지 않는 데이터를 관리합니다. 
Map : 데이터를 Key와 Value로 짝을 이루어 관리하며, Key값은 중복을 허용하지 않습니다. 
Queue : 데이터 In / Out 순서를 FIFO 방식으로 관리합니다.
Stack : 데이터 In / Out 순서를 LIFO 방식으로 관리합니다.*/

public class Ex32SetTest { // 중복 불허, 순서 없음
	// 컬렉션 타입 클래스 <제네릭 : 컬렉션에 저장할 객체의 타입 제한>
	public static void main(String[] args) {
		//HashSet<Object> hlist = new HashSet<Object>();
		HashSet<String> hlist = new HashSet<String>();
//		hlist.add(1); // 1의 기본형 int에서 Integer로 객체로 변환되어 저장됨
//		hlist.add(1.5); //double 에서 Double 클래스로 객체로 변환되어 저장

		hlist.add("첫번째");
		hlist.add("두번째");
		hlist.add("세번째");
		hlist.add("첫번째");
		hlist.add("두번째");

		System.out.println("hlist의 크기 "+hlist.size());
		hlist.remove("두번째");
		//System.out.println(hlist);		
	
//		Iterator iter = hlist.iterator(); // Iterator는 Object 객체다.
		//컬렉션의 내용을 출력할때 Iterator 반복자를 이용해 출력한다.
//		while(iter.hasNext()) {
//			String str = (String)iter.next(); 
//			System.out.println(str);
//		}
		
		Object obj[] = hlist.toArray();
		for(int i = 0; i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		for(String aa:hlist) {
			System.out.println(aa);
		}
	}
}
