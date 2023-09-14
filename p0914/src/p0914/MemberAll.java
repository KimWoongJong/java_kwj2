package p0914;

import java.util.ArrayList;

public class MemberAll {

	ArrayList list = new ArrayList();
	
	ArrayList memberRead() {
		// 객체선언 - 클래스 참조변수 = new 클래스명();
		Member m = new Member("aaa","1111","홍길동","서울","010-1111-1111");
		list.add(m);
		Member m2 = new Member("bbb","2222","유관순","부산","010-2222-2222");
		list.add(m2);
		Member m3 = new Member("ccc","3333","이순신","대구","010-3333-3333");
		list.add(m3);
		Member m4 = new Member("ddd","4444","강감찬","인천","010-4444-4444");
		list.add(m4);
		Member m5 = new Member("eee","5555","김구","광주","010-5555-5555");
		list.add(m5);
		
		return list;
	}
	

}
