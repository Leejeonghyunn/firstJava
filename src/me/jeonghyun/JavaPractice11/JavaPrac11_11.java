package me.jeonghyun.JavaPractice11;

import java.util.HashSet;
import java.util.Objects;

public class JavaPrac11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();  //HasaSet은 객체를 저장하기 전에 기존에 같은객체가 있는지 확인
		set.add("abc");               //같은 객체가 없으면 저장하고 있으면 저장하지 않는다.
		set.add("abc");
		set.add(new Person("David",10));  //boolean add(Object o)는 저장할 객체의 equals()와
		set.add(new Person("David",10));  //hashCode()를 호출 해야 HashSet이 바르게 동작. 
		
		System.out.println(set);
	}
}
class Person extends Object{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false; //형변환 가능한지 체크 
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age==p.age;
	}
	public int hashCode() {
		return Objects.hash(name,age); //Objects 클래스의 hash()메서
	}
	public String toString() { return name + ":"+age;}
}
