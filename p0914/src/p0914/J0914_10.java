package p0914;

import java.util.ArrayList;

public class J0914_10 {

	public static void main(String[] args) {
		// 배열 5개 입력, 출력
		// ArrayList 5개 입력, 출력
		
		Member[] m = new Member[5];
		
		m[0] = new Member("aaa","1111","홍길동","서울","010-1111-1111");
		m[1] = new Member("bbb","2222","유관순","부산","010-2222-2222");
		m[2] = new Member("ccc","3333","이순신","대구","010-3333-3333");
		m[3] = new Member("ddd","4444","김유신","광주","010-4444-4444");
		m[4] = new Member("eee","5555","홍범도","여수","010-5555-5555");
		
		for(int i=0;i<m.length;i++) {
			System.out.printf("%s, %s, %s, %s, %s \n"
					,m[i].getId(),m[i].getPw(),m[i].getName(),m[i].getAddress(),m[i].getPhone());
		}
		
		System.out.println("-----------------------------------------------------------------");
		
		ArrayList list = new ArrayList();
		list.add(new Member("aaa","1111","홍길동","서울","010-1111-1111"));
		list.add(new Member("bbb","2222","유관순","부산","010-2222-2222"));
		list.add(new Member("ccc","3333","이순신","대구","010-3333-3333"));
		list.add(new Member("ddd","4444","김유신","광주","010-4444-4444"));
		list.add(new Member("eee","5555","홍범도","여수","010-5555-5555"));
		
		for(int i=0;i<list.size();i++) {
			Member mm = (Member)list.get(i);
			System.out.printf("%s, %s, %s, %s, %s \n"
					,mm.getId(),mm.getPw(),mm.getName(),mm.getAddress(),mm.getPhone());
			
		}
		
		
		
		
	}

}
