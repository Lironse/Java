import java.util.Arrays;

public class Building {
	private Address address;
	private Apartment apartments[];

	public Building(Address address, Apartment[] apartments) {
		this.address = address;
		this.apartments = apartments;
	}
	
	public int largeCounter() {
		int c = 0;
		for (int i = 0; i < apartments.length; i++) {
			if(apartments[i].size() == "large") c++;
		}
		return c;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Apartment[] getApartments() {
		return apartments;
	}

	public void setApartments(Apartment[] apartments) {
		this.apartments = apartments;
	}

	
	@Override
	public String toString() {
		return "Building [address: " + address.toString() + ", apartments: " + Arrays.toString(apartments) + "]";
	}

}
