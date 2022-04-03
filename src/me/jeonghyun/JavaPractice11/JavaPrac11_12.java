package me.jeonghyun.JavaPractice11;

import java.util.HashSet;
import java.util.Iterator;
public class JavaPrac11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A="+setA);
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B="+setB);
		
		Iterator it = setB.iterator();  //setA.retainAll(setB);
		while(it.hasNext()) {           //System.out.println(setA);
			Object tmp = it.next();     //공통된 부분만 남기고 삭제
			if(setA.contains(tmp))
				setKyo.add(tmp);
	    }
		it = setA.iterator();           //setA.removeAll(setB);
		while(it.hasNext()) {           //setB와 공통요소를 제거
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
				
		}
		it = setA.iterator();           //setA.addAll(setB);
		while(it.hasNext()) 
			setHab.add(it.next());
		
	    it = setB.iterator();
	    while(it.hasNext()) 
	        setHab.add(it.next());
	        
	    System.out.println("setKyo="+setKyo);
	    System.out.println("setHab="+setHab);
	    System.out.println("setCha="+setCha);
		
	}
}
	


