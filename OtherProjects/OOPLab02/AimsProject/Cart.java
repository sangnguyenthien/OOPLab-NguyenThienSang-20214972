package AimsProject;
import java.util.ArrayList; // import the ArrayList class

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered=0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        } else {
            itemsOrdered.add(disc);
            qtyOrdered += 1;
            System.out.println("The disc has been added");

            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full");
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        qtyOrdered -= 1;
        itemsOrdered.remove(disc);
        System.out.println("Removed");
    }

    public float totalCost()
    {
        float total = 0f;
        for (DigitalVideoDisc a : itemsOrdered)
        {
            total += a.getCost();
        }
        return total;
    }



}
