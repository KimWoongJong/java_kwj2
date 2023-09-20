package p0920;

public class J0920_06 {

	public static void main(String[] args) {
		String str = new String("(샌프란시스코=연합뉴스) 김태종 특파원 = 애플의 최신 스마트폰인 아이폰15 판매 우려가 커지는 가운데 사전 주문이 호조세를 보이고 있다는 분석이 나왔다.\r\n"
				+ "\r\n"
				+ "모건스탠리는 18일(현지시간) 보고서에서 아이폰15의 리드타임(주문부터 실제 납품까지 걸리는 시간)과 사전 예약 판매가 \"우려했던 것보다 낫다\"고 밝혔다.\r\n"
				+ "\r\n"
				+ "지난 12일 공개된 아이폰15 시리즈는 15일부터 사전 주문에 들어갔다."
				+ "모건스탠리는 아이폰15 프로 맥스의 리드타임은 평균 5∼6주 정도로 \"지난 7년 동안 출시된 모델 중 가장 길다\"고 썼다."
				+ " 프로 맥스는 아이폰 시리즈 가운데 애플이 주력하고 있는 최상위 모델이다."
				);
		
		int idx = str.indexOf('아');
		System.out.println(idx);
		
		int idx2 = str.indexOf("납품");
		System.out.println(idx2);
		
		int idx3 = str.indexOf("자바");
		System.out.println(idx3);
		
		
		
	}

}
