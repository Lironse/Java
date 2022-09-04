import java.util.Arrays;

public class Building {
	private Apartment apartments[] = new Apartment[100];
	private Address address;

	public Building(Apartment[] apartments, Address address) {
		super();
		this.apartments = apartments;
		this.address = address;
	}
	
	public int largeCount() {
		int c = 0;
		for (int i = 0; i < apartments.length; i++) {
			if (apartments[i].size() == "large") c++;
		}
		return c;
	}

	@Override
	public String toString() {
		return "Building [apartments=" + Arrays.toString(apartments) + ", address=" + address + "]";
	}

	public Apartment[] getApartments() {
		return apartments;
	}

	public void setApartments(Apartment[] apartments) {
		this.apartments = apartments;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
