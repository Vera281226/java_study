package pack5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex33MapTest { 
// Map 타입의 컬렉션 : key 와 value로 구성 key값은 중복 불허
	
	public static void main(String[] args) {
		HashMap<String, String> mlist = new HashMap<String, String>();
		
		mlist.put("0","하나");
		mlist.put("1","둘");
		mlist.put("2","셋");
		mlist.put("3","둘");
		//mlist.put("3","하나"); // 값을 덮어써버림

		
		System.out.println("mlist 크기:"+mlist.size());

		System.out.println(mlist.containsKey("0"));
		System.out.println(mlist.containsValue("kbs"));
		
		@SuppressWarnings("rawtypes")
		Set set = mlist.keySet();
		@SuppressWarnings("rawtypes")
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			String k = (String)iter.next();
			System.out.println(k+" "+mlist.get(k));
		}
		
		for(String k:mlist.keySet()) {
			String value = mlist.get(k);
			System.out.println(k+" "+value);
		}
	}
}
