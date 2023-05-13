package hust.soict.ict.aims.store;

import hust.soict.ict.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<DigitalVideoDisc> wareHouse = new ArrayList<DigitalVideoDisc>(100);

    public void addDVD(DigitalVideoDisc dvd) {
        this.wareHouse.add(dvd);
        System.out.println("Added: "+dvd.getTitle());
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        if (this.wareHouse.remove(dvd)) {
            System.out.println(dvd.getTitle()+"'s removed.");
        } else {
            System.out.println(dvd.getTitle()+" hasn't in the store yet!");
        }
    }

    public void print() {
        System.out.print("[");
        int lastIndex = this.wareHouse.size() - 1;
        for (int i = 0; i <= lastIndex; i++) {
            System.out.print(this.wareHouse.get(i).getTitle() + (i == lastIndex ? "" : ", "));
        }
        System.out.println("]");
    }
}