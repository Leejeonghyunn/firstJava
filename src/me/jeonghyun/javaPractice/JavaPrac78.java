package me.jeonghyun.javaPractice;

class Product{
	int price;      //제품의 가격 
	int bonusPoint; //제품구매시 제공하는 보너스 점수 
	
	Product(int price){ 
		this.price=price;
		this.bonusPoint=(int)(price/10.0);  //보너스 점수는 제품가격의 10퍼센트
	}
}
 
 class Tv extends Product{
	 Tv(){ super(100);} //매개변수가 없는 생성자 . return값이 없다.
	                    // 조상클래스의 생성자 Product(int price) 를 호출한다.
 
	 public String toString() { return "tv";} //object클래스의 toString()을 오버라이딩 한다.
	 
 }
 class Computer extends Product {
	 Computer(){ super(200); }
	 
	 public String toString() { return "Computer";}
 }
 class Buyer {
	 int money = 1000;
	 int bonusPoint = 0;
	 
	 void buy(Product p) {  //new Tv()와 new Computer() 사용가
		 if(money < p.price) {
			 System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			 return;
		 }
		 money = money-p.price;
		 bonusPoint = bonusPoint+p.bonusPoint;
		 System.out.println(p.toString()+"을/를 구입하셨습니다" );
	 }


		
	}
 
public class JavaPrac78 {
        //예제 7-8
	public static void main(String[] args) {
	     Buyer b = new Buyer();
	     b.buy(new Tv());  //p안에 Tv가 담겨있다. 참조변수 없이 진행한것이다.
	     b.buy(new Computer());
	     
	     System.out.println("현재 남은 돈은 " + b.money + "만원입니다");
	     System.out.println("현재 보너스 점수는 " +b.bonusPoint + "점입니다.");
         
	}

}
