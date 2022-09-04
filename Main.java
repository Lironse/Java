
public class Main {
	
	public void mostLarge(Building b[]) {
		int max = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].largeCount() > max) {
				max = b[i].largeCount();
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			if (b[i].largeCount() > max) {
				System.out.println(b[i].getAddress().toString());
				Apartment a[] = b[i].getApartments();
				for (int j = 0; j < a.length; j++) {
					if (a[j].size() == "large") {
						System.out.println(a[j].getOwnerName());
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
