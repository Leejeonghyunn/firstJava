package me.jeonghyun.javaPractice;

class SutdaDeck2{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck2() {
		for(int i=0; i<cards.length;i++) {
			int num=i%10+1;
			boolean isKwang= (i<10)&(num==1||num==3||num==8);
			cards[i] = new SutdaCard(num,isKwang);
		}
	}
	void shuffle() {  //배열 cards에 담긴 카드의 위치를 뒤섞는다.
		for(int i=0;i<cards.length;i++) {
			int k = (int)(Math.random()*cards.length);
			SutdaCard tmp=cards[i];
			cards[i]=cards[k];
			cards[k]=tmp;
		}
	}
	SutdaCard pick(int index) {  //배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
		if(index<0||index>=CARD_NUM)  //유효성검사 (배열범위 넘어서선 안된다)
			return null;
		return cards[index];
	}
	SutdaCard pick() {  //배열 cards에서 임의의 위치의 SutdaCard를 반환한다.
		int index = (int)(Math.random()*cards.length); 
		return pick(index);   //pick(int index)를 호출한다.
	}
}
class SutdaCard2{
	int num;
	boolean isKwang;
	SutdaCard2(){
		this(1,true);
	}
	SutdaCard2(int num,boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	public String toString() {
		return num+(isKwang ? "K":"");
	}
}

public class JavaExer72 {

	public static void main(String[] args) {
		SutdaDeck2 deck2= new SutdaDeck2();
		System.out.println(deck2.pick(0));
		System.out.println(deck2.pick());
		deck2.shuffle();
		
		for (int i =0;i<deck2.cards.length;i++)
			System.out.print(deck2.cards[i]+",");
		System.out.println();
		System.out.println(deck2.pick(0));

	}

}
