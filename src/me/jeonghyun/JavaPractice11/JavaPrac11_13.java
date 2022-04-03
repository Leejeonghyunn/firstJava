package me.jeonghyun.JavaPractice11;
import java.util.*;

public class JavaPrac11_13 {

	public static void main(String[] args) {
		Set set  = new TreeSet(); // 범위검색, 정렬에 유리 -> 정렬필요없음 
        Set set2 = new HashSet(); // 정렬 필요하다.
        
        
		for(int i =0; set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num)); //TreeSet의 add는 비교하면서 저장한다(비교기준 필요함)
		}
		for(int i =0; set2.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set2.add(new Integer(num)); //HashSet의 add는 정렬이 필요하다.
		}
		
		List list = new LinkedList(set2);
        Collections.sort(list);
        System.out.println(list); //set2를 정렬한다 
		System.out.println(set);
		
	}

}
