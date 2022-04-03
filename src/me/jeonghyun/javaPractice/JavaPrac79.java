package me.jeonghyun.javaPractice;

class Product2{
	int price;      //제품의 가격 
	int bonusPoint; //제품구매시 제공하는 보너스 점수 
	
	Product2(int price){ 
		this.price=price;
		this.bonusPoint=(int)(price/10.0);  //보너스 점수는 제품가격의 10퍼센트
	}
	Product2(){} // 기본생성
}
 
 class Tv2 extends Product2{
	 Tv2(){ super(100);} //매개변수가 없는 생성자 . return값이 없다.
	                    // 조상클래스의 생성자 Product(int price) 를 호출한다.
 
	 public String toString() { return "tv";} //object클래스의 toString()을 오버라이딩 한다.
	 
 }
 class Computer2 extends Product2 {
	 Computer2(){ super(200); }
	 
	 public String toString() { return "Computer";}
 }
 class Audio extends Product2{
	 Audio(){ super(50);}
	 
	 public String toString() {return "Audio";}
 }
 
 class Buyer2 { //물건을 사는 사람 
	 int money = 1000;
	 int bonusPoint = 0;
	 Product2[] cart = new Product2[10];  // 쇼핑카트. 구입한 제품을 저장하기 위한 배열.
	 int i =0; //Product 배열에 사용될 카운터 
	 
	 void buy(Product2 p) {
		 if(money < p.price) {
			 System.out.println("잔액이 부족해서 물건을 살 수 없습니다.");
			 return;
		 }
		 money = money-p.price;
		 bonusPoint=bonusPoint+p.bonusPoint;
		 cart[i++] = p;        //제품을 product2[] cart 에 저장한다.
		 System.out.println(p.toString() + "을/를 구입하셨습니다.");
	 }	 
	 void summary() { //구매한 물품의 정보를 요약해서 보여준다.
		 int sum = 0;
		 String itemList = " ";
		 
		 for(int i =0; i<cart.length;i++) {   //반복문을 이용해서 구입한 물품의 총가격 과 목록을 만든다.
			 if(cart[i]==null) break;  //물품이 들어있지 않은경우 break
			 sum = sum+cart[i].price;
			 itemList = itemList+cart[i].toString() + ",";
		 }
		 System.out.println("구입하신 물품의 총금액은 " + sum +"만원입니다.");
		 System.out.println("구입하신 제품은 " + itemList + "입니다.");	 
	 }
 }
 

public class JavaPrac79 { // 예제 7-9

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}
}
