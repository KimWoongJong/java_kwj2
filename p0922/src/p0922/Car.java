package p0922;

public class Car {
	
	public Car() {}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	private String color;
	private int door;
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

}
