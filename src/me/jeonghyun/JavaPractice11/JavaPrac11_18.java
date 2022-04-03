package me.jeonghyun.JavaPractice11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class JavaPrac11_18 { //문자열 배열에 담긴 문자열들의 빈도수 구하기 (단어카운팅)

	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		for(int i=0; i<data.length;i++) {
			if(map.containsKey(data[i])) {         //HashMap에 같은 문자열이 키로 저장되어 있는지 containsKey()로 
				int value = (int)map.get(data[i]); //확인하여 이미 저장되어 있는 문자열이면 값을 1증가 시킨다.//Object get(Object key)
				map.put(data[i], value+1);         //기존에 있는 키는 기존값에 1을 더해서 저장 
	        } else {
	    	map.put(data[i], 1);
	       }
		}
        Iterator it = map.entrySet().iterator();
        
        while(it.hasNext()) {
        	Map.Entry entry = (Map.Entry)it.next();
        	int value = (int)entry.getValue();
        	System.out.println(entry.getKey() + " : " + printBar('#',value) + "" + value);
        }
	}
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i =0; i<bar.length; i++)
			bar[i]=ch;
		
		return new String(bar);
	}

}
// 한정되지 않은 범위의 비순차적인 값들의 빈도수는 HashMap을 이용해서 구할 수 있다.