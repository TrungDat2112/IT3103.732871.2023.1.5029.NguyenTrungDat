package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;
//Nguyen Hoang Thuong 20215146
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media... m_list) {
        for (Media m : m_list) {
            itemsInStore.add(m);
        }
    }

    public void removeMedia(Media m) {
        itemsInStore.remove(m);
    }

    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2, DigitalVideoDisc dvd3) {
    }

    public void print() {
    }

    //// print Store
    // public void print() {
    // System.out.println("***********************STORE***********************");
    // for (int i = 0; i < quantity; i++) {
    // System.out.println(itemsInStore[i].toString());
    // }
    // System.out.println("**************************************************");
    // }
}
