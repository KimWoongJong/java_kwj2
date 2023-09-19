package p0919;

public class KorPerson {
	
	KorPerson(){}
	KorPerson(String juminNo, String name){
		this.juminNo = juminNo;
		this.name = name;
	}
	
	String juminNo;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		boolean temp = false;
		KorPerson k = (KorPerson)obj;
		if(juminNo.equals(k.juminNo)) {
			temp = true;
		}
		return temp;
	}
	
	public String toString() {
		return String.format("[%s,%s]",juminNo,name);
	}
	
}
