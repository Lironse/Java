import java.util.UUID; // instead of names

public class Main {
	
	/*
	 * create a city which has an array of buildings which have an address and an
	 * array of apartments which have an array of rooms and an owner name
	 */
	
	public static int Random(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
	
	public static double Random(double min, double max) {
		return (double) Math.round(100*((Math.random() * (max - min)) + min)) / 100;
	}

	public static Room roomGen() {
		Room room = new Room(Random(0, 8.0), Random(0, 8.0), "type");
		return room;
	}

	public static Apartment apGen() {
		Room rooms[] = new Room[Random(1, 10)];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = roomGen();
		}
        UUID uuid = UUID.randomUUID();
		Apartment ap = new Apartment("name: "+uuid.toString(), rooms);
		return ap;
	}

	public static Address adGen() {
		return new Address("city", "street", Random(1,1000));
	}

	public static Building buildGen() {

		Apartment aps[] = new Apartment[Random(1, 100)];
		for (int i = 0; i < aps.length; i++) {
			aps[i] = apGen();
		}

		return new Building(adGen(), aps);

	}

	public static void largeCount(Building[] city) {
		int max = 0;
		for (int i = 0; i < city.length; i++) {
			if(city[i].largeCounter()>max) max = city[i].largeCounter();
		}
		for (int i = 0; i < city.length; i++) {
			if(city[i].largeCounter() == max) {
				System.out.println(city[i].getAddress());
				for (int j = 0; j < city[i].getApartments().length; j++) {
					if(city[i].getApartments()[j].size() == "large");
					System.out.println(city[i].getApartments()[j].getApartmentOwnerName());
				}
			}
		}
	}
	
}
