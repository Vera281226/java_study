package pack5;

import java.util.ArrayList;

public class Ex34List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("볼펜");
		list.add("연필");
		list.add("볼펜+");
		list.add("볼펜");
		list.add("마우스");
		
		
		System.out.println(list);
		System.out.println("list 크기:"+list.size());
		
		
		list.remove("볼펜"); //중복된 것중에 최초의 객체만 지워짐
		System.out.println(list.get(0));
		list.remove(1); // 앞에서 하나가 삭제되면 순서가 하나씩 당겨져 바뀌어진다
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String data:list) {
			System.out.println(data);
		}
	}
}
