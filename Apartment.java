
public class Apartment {
	private String ownerName;
	private Room rooms[] = new Room[10];

	public Apartment(String ownerName, Room[] rooms) {
		this.ownerName = ownerName;
		this.rooms = rooms;
	}
	

	public double area() {
		double area = 0;
		for (int i = 0; i < rooms.length; i++) {
			area += rooms[i].area();
		}
		return area;
	}
	
	public String size() {
		double area = this.area();
		if (area<=70) return "small";
		else if (area<=110) return "medium";
		else if (area>110) return "big";
		else return "error";
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
