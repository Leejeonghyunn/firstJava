package me.jeonghyun.JavaPractice11;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaPrac11_5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); // 다른 컬렉션으로 변경할때는 new ArrayList() 부분만 고치면 된다.
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();   //Iterator메서드 호출. 객체를 얻을 수 있다.
		                                 //1회용. 다쓰고나면 다시 Iterator 객체를 얻어와야 한다. 
		
		while(it.hasNext()) { // boolean hasNext() 읽어올 요소 남아있는지 확인 
			Object obj = it.next(); // Object next() 다음 요소를 읽어오기
			System.out.println(obj);
			
	    //for(int i=0; i<list.size();i++){
	    //  Object obj = list.get(i);
	    //  System.out.println(obj); } 과 동일하다.
			//List클래스들은 Iterator 대신 for과 get()으로도 모든요소들을 출력할 수 있다.
		}
		

	}

}
