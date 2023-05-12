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
        for (int i = 0; i < qtyOrdered; i++) {
            if(itemsOrder[i]!=null) {
                totalCost += itemsOrder[i].getCost();
            }
        }
        return df.format(totalCost);
    }
}
