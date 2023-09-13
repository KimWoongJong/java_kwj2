package p0913;

public class Time {
	
	int hour;
	int minute;
	int second;

	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour<0 || hour>23) {
			System.out.println("시간이 잘못 입력되었습니다.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute<0 || minute>59) {
			System.out.println("분이 잘못 입력되었습니다.");
			return;
		}
		this.minute = minute;
	}
		
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second<0 || second>59) {
			System.out.println("초가 잘못 입력되었습니다.");
			return;
		}
		this.second = second;
	}
	
}
