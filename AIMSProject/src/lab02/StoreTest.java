package lab02;
public class StoreTest {
	public static void main(String[] args) {
		Store dvdStore = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		dvdStore.addDVD(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geoge Lucas", 87, 24.95f);
		dvdStore.addDVD(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 23.65f);
		dvdStore.addDVD(dvd3);
		dvdStore.removeDVD(dvd3);
	}
}