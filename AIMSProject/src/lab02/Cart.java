package lab02;

import java.text.DecimalFormat;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered ;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    // Method to add a DigitalVideoDisc to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered - 1 == MAX_NUMBER_ORDERED ){
            System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 The cart is almost full");
        }
        else{

            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;

            System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 The disc has been added");
        }
    }
    // Method to remove a DigitalVideoDisc from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int check = 0;
        for (int i = 0; i <= qtyOrdered; i++) {
            if (disc.equals(itemsOrdered[i])) {
                check = i;
            }
        }
        if(check >= 0) {
            System.out.println("The dvd" + (check + 1) +" has been deleted");
            for (int i = check; i <= qtyOrdered; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }

        }
        else {
            System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 Don't have the disc in the cart");
        }
        qtyOrdered--;
    }
    // Method to calculate the total cost of items in the cart
    public double totalCost(){
        double totalCost = 0;
        for(int i = 0; i < qtyOrdered; i++){
            totalCost += itemsOrdered[i].getCost();
            
        }

        double number = totalCost;
        DecimalFormat df = new DecimalFormat("0.00");

        // Use formatting patterns to format numbers
        String formattedNumber = df.format(number);
        return Double.valueOf(formattedNumber);  }
    
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(int i = 0; i < dvdList.length; i++){
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered++;
        }
        System.out.println("Nguyá»…n Trung Äáº¡t - 20215029 Add list complete");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        itemsOrdered[qtyOrdered] = dvd1;
        itemsOrdered[qtyOrdered + 1] = dvd2;
        qtyOrdered += 2;
    }

}