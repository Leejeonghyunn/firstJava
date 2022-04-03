package me.jeonghyun.javaPractice;

class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	final int Max_Volume = 100;
	final int Min_Volume = 0;
	final int Max_Channel = 100;
	final int Min_Channel = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		if(volume<Max_Volume)
			volume++;
	}
	void volumeDown() {
		if(volume>Min_Volume)
			volume--;
	}
	void channelUp() {
		if(channel == Max_Channel) {
			channel = Min_Channel;
		}else {
			channel++;
		}
	}
    void channelDown()  {
    	if(channel == Min_Channel) {
    		channel = Max_Channel;
    	}else {
    		channel--;
    	}
    }
}

public class Practice619 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv t = new MyTv();
		t.channel=100;  //채널값 설정  
		t.volume = 0;   //볼륨값 설정 
		System.out.println("CH : "+t.channel+ ", VOL :"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel + ", VOL:"+t.volume);
		
		t.volume=100; //볼륨값 변경 
		t.channelUp();
		t.volumeUp();
		System.out.println("CH :"+t.channel +", VOL: " +t.volume);
		
		

	}

}
