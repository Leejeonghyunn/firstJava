package me.jeonghyun.javaPractice;
//MyTv2 클래스에 이전채널(previous channel)로 이동하는 기능의 메서드를 추가하시오
class MyTv4{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
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
		prevChannel=this.channel; //현재채널을 이전채널에 저장한다.
		this.channel=channel;     //채널이 바뀔때마다 이 변수에 바뀌기전의 채널을 저장해야 한다.
	}
	public int getChannel() {
		return channel;
	}
	public void gotoPrevChannel() {
		setChannel(prevChannel);   //현재채널을 이전채널로 변경한다. setChannel()호출.
	}
}
public class JavaPrac7_5 {

	public static void main(String[] args) {
		MyTv4 t2 = new MyTv4();
		t2.setChannel(10);
		System.out.println("CH :" + t2.getChannel());
		t2.setChannel(20);
		System.out.println("VOL :" + t2.getChannel());
		t2.gotoPrevChannel();
		System.out.println("CH : " + t2.getChannel());
		t2.gotoPrevChannel();
		System.out.println("CH : " + t2.getChannel());
		

	}

}
