package AimsProject.src.hust.soict.cs.aims.cart;
import AimsProject.src.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered=0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    //add an item to the current cart.
    public void addMedia(Media media) {
        if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full");
            return;
        } else {
            itemsOrdered.add(media);
            qtyOrdered += 1;
            System.out.println("Added!");

            if (qtyOrdered == MAX_NUMBERS_ORDERED) {
                System.out.println("The cart is almost full");
            }
        }
    }

    //add a list of media to the current cart.
    public void addMedia(Media[] media)
    {
        for(Media d : media)
        {
            addMedia(d);
        }
    }

    //Remove an item from the cart
    public void removeMedia(Media media)
    {
        qtyOrdered -= 1;
        itemsOrdered.remove(media);
        System.out.println("Removed");
    }

    //Remove a list of items from the cart
    public void removeMedia(Media[] media)
    {
        qtyOrdered -= media.length;
        for (Media a : media)
        {
            itemsOrdered.remove(a);
            System.out.println("Removed");
        }
    }

    public float totalCost()
    {
        float total = 0f;
        for (Media a : itemsOrdered)
        {
            total += a.getCost();
        }
        return total;
    }

    //method to print the list of ordered items of a cart, the price of each item, and the total price.
    public void displayCart()
    {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 1;
        for(Media a : itemsOrdered)
        {
            System.out.println(i + ". " + a.toString());
            i++;
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

}
