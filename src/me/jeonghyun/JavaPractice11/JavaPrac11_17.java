package me.jeonghyun.JavaPractice11;
import java.util.*;
public class JavaPrac11_17 { //EntrySet을 이용하여 map에 저장된 데이터를 읽어오는 방법 

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		Set set = map.entrySet(); //Set EntrySet(): HashMap에 저장된 키와 값을 엔트리의 형태로 Set에 저장해서 반환 
		Iterator it = set.iterator();
		
	    while(it.hasNext()) {
	    	Map.Entry e = (Map.Entry)it.next(); // Map인터페이스.Entry인터페이스(Map의 내부인터페이스) 
	    	System.out.println("이름 : "+ e.getKey() + ", 점수 :"+ e.getValue());
	    }
	   set = map.keySet();       //Set keySet() : HashMap이 저장된 모든key가 저장된 Set을 반환 
       System.out.println("참가자 명단 : "+ set);
       
       Collection values = map.values();  // Collection values() : HashMap에 저장된value 컬렉션의 형태로 변환 
       it = values.iterator();
       
       int total = 0;
       
       while(it.hasNext()) {
    	   int i = (int)it.next(); // Integer i = (Integer)it.next();
    	   total += i;
       }
       System.out.println("총점 : " + total);
       System.out.println("평균 : " + (float)total/set.size());
       System.out.println("최고점수 : " + Collections.max(values)); //Comparable을 구현한 클래스의 객체만 들어올 수 있다(비교기준 필요)
       System.out.println("최저점수 : " + Collections.min(values));
	}

}
