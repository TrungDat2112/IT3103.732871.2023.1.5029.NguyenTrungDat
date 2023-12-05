package lab02;
import java.util.ArrayList;
public class Store {
	
	ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	public void removeDVD(DigitalVideoDisc disc) {
		itemsInStore.remove(disc);
		System.out.println("The disc " + disc.getTitle() + " has been removed");
	}

	public void addDVD(DigitalVideoDisc disc) {
		
			itemsInStore.add(disc);
			System.out.println("The disc " + disc.getTitle() + " has been added");
	}
	
}
