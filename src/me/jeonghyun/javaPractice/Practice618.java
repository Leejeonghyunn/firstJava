package me.jeonghyun.javaPractice;

public class Practice618 {
	public static boolean isNumber(String str) {
		if(str==null||str.equals(" "))  //유효성 체크 
			return false;
		for(int i = 0; i<str.length(); i++) {  //반복문과 chatAt(int i)를 이용해서 문자열에서 한 문자씩
			char ch = str.charAt(i);           //차례대로 읽어와 chat타입의 변수 ch에 저장한다.
			
					if(ch<'0'||ch>'9') {       //읽어온 문자ch가 숫자가 아니면 false를 반환한다.
						return false;
					}
		} //for
		return true;
	}

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
		

	}

}
