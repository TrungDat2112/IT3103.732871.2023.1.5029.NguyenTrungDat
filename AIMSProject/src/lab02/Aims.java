package lab02;

public class Aims {
	public static void main(String[] args) {
		//Create a new Cart
		Cart anOrder = new Cart();
		//Create a new dvd objects and add them to cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		// Print the total cost of items in the cart
        System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 Total cost in the cart: $" + anOrder.totalCost());

        // Remove a DVD from the cart
        anOrder.removeDigitalVideoDisc(dvd1);

        // Print the total cost after removal
        System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 Total cost after removal: $" + anOrder.totalCost());
	}
}
