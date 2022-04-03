package me.jeonghyun.JavaPractice11;

import java.util.Arrays;
import java.util.Comparator;

public class JavaPrac11_7 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //String의 comparable구현에 의한 정렬
	    System.out.println("strArr="+ Arrays.toString(strArr));
	    
	    Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);   //대소문자 구분안함 
	    System.out.println("strArr="+ Arrays.toString(strArr));
	    
	    
	    Arrays.sort(strArr, new Descending());  //역순정렬(정렬대상,정렬기준)  //static void sort(Object[] a, Comparator c)
	    System.out.println("strArr="+ Arrays.toString(strArr));
	}
}
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if ( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1;  //-1을 곱해서 기본 정렬방식의 역으로 변경한다.
		}                                //또는 c2.compareTo(c1와 같이 순서를 바꿔도 된다.
		return -1;
	}
	
}
		

	


