package me.jeonghyun.javaPractice;

public class Practice621 {  //주어진 값의 절대값을 반환한다.
    public static int abs(int value) {
    	return value>= 0 ? value:-value;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5;
		System.out.println(value+ "의 절대값 :" +abs(value));
		value = -10;
		System.out.println(value +"의 절대값 :"+abs(value));

	}

}
