package me.jeonghyun.JavaPractice11;

import java.util.Arrays;
import java.util.Comparator;

public class JavaPrac11_8 {  //정렬할때는 항상 정렬기준이 필요하다. 정렬기준을 매개변수로 제공하던가, 정렬대상에 저장된 객체가
	                         //정렬기준을 가지고 있어야 한다. 그렇지않으면 예외가 발생한다.

	public static void main(String[] args) {
		Integer[] arr = { 30, 50, 10, 40, 20};
		
		Arrays.sort(arr);  //Integer가 가지고 있는 기본정렬기준 compareTo()로 정렬 
        System.out.println(Arrays.toString(arr));
        
        // sort(Object[] objArr, Comparator c) 
        Arrays.sort(arr, new DescComp()); //DescComp에 구현된 정렬 기준으로 정렬.
        System.out.println(Arrays.toString(arr));
	}
}
class DescComp implements Comparator{
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
           return -1;  //Integer가 아니면, 비교하지 않고 -1반환
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i.compareTo(i2)*-1; //기본정렬인 compareTo()의 역순으로 정렬 
		                           //정렬기준이라는 것은 단순이 양수,0,음수 중에서 하나를 반환하도록 작성된 메서드라서,
		                           //그저 -1을 곱하기만 하면 반대로 정렬된 결과를 얻을 수 있다.
	}
}
