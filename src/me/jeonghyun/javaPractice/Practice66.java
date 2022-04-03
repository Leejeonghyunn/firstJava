package me.jeonghyun.javaPractice;
//클래스 메서드 getDistance()를MyPoint 클래스의 인스턴스 메서드로 정의하시오.

public class Practice66 {


	static class MyPointer {
		int x;
		int y;
		public MyPointer(int x , int y){
			this.x=x;
			this.y=y;
		}
		double getDistance(int x1 ,int y1) {
			return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		}
	}

	public static void main(String[] args) {
		MyPointer myPointer = new MyPointer(1, 2);
		System.out.println(myPointer.getDistance(1,2));
	}

}