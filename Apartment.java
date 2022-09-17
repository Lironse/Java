import java.util.Arrays;

public class Apartment {
	private String ApartmentOwnerName;
	private Room rooms[];

	public Apartment(String apartmentOwnerName, Room[] rooms) {
		ApartmentOwnerName = apartmentOwnerName;
		this.rooms = rooms;
	}
	
	public double totalArea() {
		double area = 0;
		for (int i = 0; i < rooms.length; i++) {
			area += rooms[i].area();
		}
		return (double)Math.round(area*100)/100;
	}

	public String size() {
		if(totalArea()<=70) return "small";
		else if (totalArea()<=110) return "medium";
		else return "large";
	}
	
	public String getApartmentOwnerName() {
		return ApartmentOwnerName;
	}

	public void setApartmentOwnerName(String apartmentOwnerName) {
		ApartmentOwnerName = apartmentOwnerName;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "[Owner: " + ApartmentOwnerName + ", rooms: " + Arrays.toString(rooms) + "]";
	}

}
