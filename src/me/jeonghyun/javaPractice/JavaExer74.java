package me.jeonghyun.javaPractice;
//MyTv클래스의 멤버변수 isPowerOn,channel,volume 을 클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 값을
//어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하시오.
class MyTv3{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	public void setVolume(int volume) { 
		if(volume>MAX_VOLUME || volume<MIN_VOLUME) //매개변수가 있는 메서드에는 유효성 검사 필수
			return;
		this.volume=volume;
	}
	public int getVolume() {
		return volume;
	}
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL)
			return;
		this.channel=channel;
	}
	public int getChannel() {
		return channel;
	}
}
public class JavaExer74 {

	public static void main(String[] args) {
		MyTv3 t = new MyTv3();
		t.setChannel(10);
		System.out.println("CH :" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL :" + t.getVolume());

	}

}
