
public class Room {

	private String name;
	private double l, w;

	public Room(String name, double l, double w) {
		this.name = name;
		this.l = l;
		this.w = w;
	}

	public Room(Room a) {
		this.name = a.getName();
		this.l = a.getL();
		this.w = a.getW();
	}

	public double area() {
		return l * w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

}
