package p0908;

public class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power; // 스위치 on/off
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	

}
