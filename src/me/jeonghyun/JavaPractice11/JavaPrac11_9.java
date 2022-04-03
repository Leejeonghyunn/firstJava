package me.jeonghyun.JavaPractice11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaPrac11_9 { //HashSet의 특징을 이용하면, 컬렉션 내의 중복 요소들을 쉽게 제거할 수 있다. 

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2" , "2", "3", "3", "4", "4", "4" };
		Set set= new HashSet();
		
	    for(int i =0; i<objArr.length; i++) {
	    	set.add(objArr[i]);  //HashSet에 objArr의 요소들을 저장한다.
	    }
	    System.out.println(set); //HashSet에 저장된 요소들을 출력한다.
	    
	    Iterator it = set.iterator(); //HashSet에 저장된 요소들을 출력한다.(Iterator이용) // 컬렉션에 저장된 요소들을 읽어오는방법을 표준화 
	    while(it.hasNext()) {                   //iterator메서드 실행 
	    	System.out.println(it.next());      //hasNext()호출 : 읽어올 요소가 남아있는지 확인 
	    }                                       //it.Next() : 요소를 읽어오
		
		

	}

}
