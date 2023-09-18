package p0918;

abstract public class Player { // 추상메서드를 하나라도 가지고 있는 경우, 클래스명 앞에 abstract를 넣어줘야 함

	int currentPos; // 현재 위치 저장 변수
	
	Player(){
		currentPos = 0;
	}
	
	abstract void play(int pos); // 중괄호 없으면 미완성, 중괄호 있으면 완성(내용이 있든 없든)
	abstract void stop();
	
	void play() {
		play(currentPos); // play(int pos) 추상메소드 호출.. 호출은 가능하지만 추상메서드를 구현하기 전까지 사용할 수는 없음
	}
	
}
