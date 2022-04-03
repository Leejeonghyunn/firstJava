package me.jeonghyun.JavaPractice11;
import java.util.*;

public class JavaPrac11_10 { //중복된 값은 저장하지 않는 HashSet의 성질을 이용하여 로또번호를 만드는 예제

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i =0; set.size()<6;i++) {      //set의 크기가 6보다 작은동안 1~45사이의 난수를 저장 
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set); //LinkedList(Collection c)
		Collections.sort(list);          //Collections.sort(List list)
		System.out.println(list);        //set의 모든요소를 LinkedList에 저장.List를 정렬.List를 출력 

	}

}
