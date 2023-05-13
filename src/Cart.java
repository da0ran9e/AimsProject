import java.text.DecimalFormat;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrder[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;
    private float totalCost = 0f;
    public int getQtyOrderd() {
        return this.qtyOrdered;
    }
    DecimalFormat df = new DecimalFormat("###.###");
    public boolean full() {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            return true;
        } else {
            return false;
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (full()) {
            System.out.println("The Cart is almost full");
        }
        else {
            itemsOrder[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered == 0){
            System.out.println("There is no item in cart!");
        }
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemsOrder[i] == disc) {
                    itemsOrder[i] = null;
                }
                if (itemsOrder[i] == null){
                    itemsOrder[i] = itemsOrder[i+1];
                    itemsOrder[i+1] = null;
                }
            }
            qtyOrdered--;
            System.out.println("The disc has been removed!");
        }
    }

    public String totalCost() {
        for (int i = 0; i < this.qtyOrdered; i++) {
            if(itemsOrder[i]!=null) {
                totalCost += itemsOrder[i].getCost();
            }
        }
        return df.format(totalCost);
    }
    public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");

		DigitalVideoDisc dvd;
        for (int i = 0; i < this.qtyOrdered; i++) {
        	dvd = this.itemsOrder[i];
        	System.out.printf("%d. %s\n", i+1, dvd.toString());
        }

		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
        public void searchByID(int id) {
		System.out.println("Search for: " + id);

		DigitalVideoDisc dvd;
        for (int i = 0; i < this.qtyOrdered; i++) {
        	dvd = this.itemsOrder[i];
        	if (dvd.getId() == id) {
        		System.out.println("Found: " + dvd.toString());
        		return;
        	}
        }
        System.out.println("Disc not found.");
	}

	public void searchByTitle(String keywords) {
		System.out.println("- Search for: \"" + keywords + "\"");

		int found = 0;
		DigitalVideoDisc dvd;
        for (int i = 0; i < this.qtyOrdered; i++) {
        	dvd = this.itemsOrder[i];
        	if (dvd.isMatch(keywords)) {
        		System.out.println("Found: " + dvd.toString());
        		// No return because there maybe many found
        		found += 1;
        	}
        }
        if (found == 0) {
        	System.out.println("Disc not found.");
        }
	}
}
}
