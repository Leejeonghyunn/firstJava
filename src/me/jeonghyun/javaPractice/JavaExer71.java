package me.jeonghyun.javaPractice;
//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck 클래스)을 정의한것이다. 섯다카드 20장을
//담는 SutdaCard 배열을 초기화 하시오.

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 객체배열 생성 
	
	public SutdaDeck() {  // 생성자를 통해 객체배열 SutdaCard에 SutdaCard 인스턴스를 생성해서 저장한다.
		for(int i =0; i<cards.length;i++ ) {  // 반복문을 이용해서 배열의 크기만큼 SutdaCard인스턴스 생성 
			int num=i%10+1;                   // i의 값이 0~19 까지 변하는동안 우리가 원하는 num값 얻기위해서 
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);    // and가 or보다 우선순위이므로 괄호 필수 
			cards[i] = new SutdaCard(num,isKwang);  //객체배열에 인스턴스를 생성
		}
	}
}

class SutdaCard{
	int num;
    boolean isKwang;
    
    SutdaCard(){
    	this(1,true);
    }
    SutdaCard(int num,boolean isKwang){
    	this.num = num;
    	this.isKwang=isKwang;
    }
    public String toString() {
    	return num + (isKwang ? "K" :"");
    }
}

public class JavaExer71 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for (int i =0; i <deck.cards.length; i++)
		    System.out.print(deck.cards[i]+ ",");

	}

}
