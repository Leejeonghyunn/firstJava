package me.jeonghyun.JavaPractice11;

import java.util.HashMap;
import java.util.Scanner;
public class JavaPrac11_16 {  //HashMap을 생성후 Id와 비밀번호를 키와 쌍으로 저장한다음 입력한 id를 Key로 
                              //HashMap에서 검색해서 얻을 Value를 입력한 비밀번호와 비교하는 예제이다. 
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234"); //Object put(Object key, Object value) :지정된 키와 값을 HashMap에 저장 
		map.put("abcd", "1111");
		map.put("abcd", "1234"); //abcd 이미 존재하는 키 추가가능. 기존값은 없어짐.
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
		    System.out.print("id :");
		    String id = s.nextLine().trim();
		    
		    System.out.print("password :");
		    String password = s.nextLine().trim();
		    System.out.println();
		    
		    if(!map.containsKey(id)) {   //boolean containsKey(Object key) : HashMap에 지정된 키가 포함되었는지 알려줌 
		    	System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");;
		    	continue;
		    }
		    
		    if(!(map.get(id)).equals(password)) {  //Object get(Object key) : 지정된 key의 값 value를 반환 
		    	System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
		    } else {
		    	System.out.println("id와 비밀번호가 일치합니다.");
		    	break; //무한반복문 빠져나옴 
		    }
		    
		}

	}

}
