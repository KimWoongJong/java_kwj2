package p0913;

public class Singleton {
	
	private int hour;
	private int minute;
	private int second;
	
	private Singleton() {}
	
	private static Singleton s = new Singleton();
	
	public static Singleton getInstance() {
		return s;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public static Singleton getS() {
		return s;
	}

	public static void setS(Singleton s) {
		Singleton.s = s;
	}
	
	
	
	
	
	
	

}
