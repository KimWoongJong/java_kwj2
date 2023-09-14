package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList list = new ArrayList();

		list.add(new Member("aaa", "1111", "홍길동", "서울", "010-1111-1111")); // Member객체는 Object객체로 자동형변환 됨.
		list.add(new Member("bbb", "2222", "유관순", "부산", "010-2222-2222"));
		list.add(new Member("ccc", "3333", "이순신", "대구", "010-3333-3333"));
		list.add(new Member("ddd", "4444", "강감찬", "인천", "010-4444-4444"));
		list.add(new Member("eee", "5555", "김구", "광주", "010-5555-5555"));

		
		System.out.println("[ 하이마켓 쇼핑몰 로그인 ]");
		String id = "";
		String pw = "";
		String name = "";
		
		loop:while(true) {
			System.out.println("아이디를 입력하세요.");
			id = scan.next();
			System.out.println("패스워드를 입력하세요.");
			pw = scan.next();
			
			int check = 0;
			for(int i=0;i<list.size();i++) {
				Member mm = (Member)list.get(i);
				if(id.equals(mm.getId()) && pw.equals(mm.getPw())) {
					System.out.println("로그인 되었습니다.");
					name = mm.getName();
					System.out.println();
					check = 1;
					break loop;
				}//if
			}//for
			
			//check = 1;
			if(check==0) {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
				System.out.println();
			}//if
		}//while
		
		
		Buyer b1 = new Buyer(id,name);
		int choice = 0;
		while(true) {
			System.out.println("[ 하이마켓 가전 쇼핑몰 ]");
			System.out.println("1. TV");
			System.out.println("2. 컴퓨터");
			System.out.println("3. 오디오");
			System.out.println("4. 세탁기");
			System.out.println("5. 현재잔액조회");
			System.out.println("9. 총구매목록");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------------------");
			System.out.println("구매를 원하는 번호를 입력하세요.");
			choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("[ TV 구매 ]");
				System.out.println("결제를 진행할까요?(1.예 2.아니오)");
				choice = scan.nextInt();
				if(choice==1) {
					System.out.println("TV를 구매하셨습니다.");
					b1.buy(new Tv());
					System.out.printf("구매 후 잔액 : %d \n",b1.money);
					System.out.println();
				}else {
					System.out.println("TV구매를 취소하셨습니다.");
					System.out.println();
				}
				break;
				
				
				
				
			case 5:
				System.out.println("[ 잔액 조회 ]");
				System.out.println("-------------------------");
				System.out.printf("%s님 현재잔액 : %,d 원 \n",b1.name,b1.money);
				System.out.println();
				break;
			
			}//switch
			
		}//while
		
		
	}//main

}//class
