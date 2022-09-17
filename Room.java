
public class Room {
	private double length, width;
	private String name;

	public Room(double length, double width, String name) {
		this.length = length;
		this.width = width;
		this.name = name;
	}

	public void copyRoom(Room a) {
		this.length = a.length;
		this.width = a.width;
		this.name = a.name;
	}
	
	public double area() {
		return length*width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Room [length=" + length + ", width=" + width + ", name=" + name + "]";
	}

}
