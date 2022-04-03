package me.jeonghyun.firstJava;

import java.util.Scanner;

public class JavaWhile {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세세요.(예 : 12345)>");
		
	Scanner scanner = new Scanner(System.in);
	String tmp = scanner.nextLine();
	num = Integer.parseInt(tmp);
	
	while(num!=0) {
		sum += num%10;
		System.out.printf("sum=%3d, num=%4d%n" , sum, num);
		num /= 10;
	}
      System.out.println("각 자리수의 합: "+sum);
	}

}
