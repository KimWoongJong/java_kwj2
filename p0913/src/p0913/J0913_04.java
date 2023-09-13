package p0913;

public class J0913_04 {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = 13;
//		t.minute = 13;
//		t.second = 13;
		t.setHour(13);
		t.setMinute(13);
		t.setSecond(13);
		System.out.printf("%d시%d분%d초 \n",t.getHour(),t.getMinute(),t.getSecond());
		
		Time t2 = new Time();
//		t2.hour = 50;
//		t2.minute = 55;
//		t2.second = 198;
		t2.setHour(50);
		t2.setMinute(55);
		t2.setSecond(198);
		System.out.printf("%d시%d분%d초 \n",t2.getHour(),t2.getMinute(),t2.getSecond());
		
	}

}
