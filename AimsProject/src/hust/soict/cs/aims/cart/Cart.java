package AimsProject.src.hust.soict.cs.aims.cart;
import AimsProject.src.hust.soict.cs.aims.disc.DigitalVideoDisc;

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

    //add a list of DVDs to the current cart.
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList)
    {
        for(DigitalVideoDisc disc : dvdList)
        {
            addDigitalVideoDisc(disc);
        }
    }
    /*
    //pass an arbitrary number of arguments for dvd.
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList)
    {
        for(DigitalVideoDisc disc : dvdList)
        {
            addDigitalVideoDisc(disc);
        }
    }

    */

    //2.2 Overloading by differing the number of parameters
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)
    {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        qtyOrdered -= 1;
        itemsOrdered.remove(disc);
        System.out.println("Removed");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc[] dvdList)
    {
        qtyOrdered -= dvdList.length;
        for (DigitalVideoDisc a : dvdList)
        {
            itemsOrdered.remove(a);
            System.out.println("Removed");
        }
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

    //method to print the list of ordered items of a cart, the price of each item, and the total price.
    public void displayCart()
    {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 1;
        for(DigitalVideoDisc a : itemsOrdered)
        {
            System.out.println(i + ". " + a.toString());
            i++;
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    //Search for DVDs in the cart by ID and display the search results
    public void searchByID(int id)
    {
        for(DigitalVideoDisc disc : itemsOrdered)
        {
            if (disc.getId() == id)
            {
                System.out.println("FOUND: " + disc.toString());
                return;
            }
        }
        System.out.println("NOT FOUND");
    }

    //Search for DVDs in the cart by title and print the results
    public void searchByTitle(String title)
    {
        for(DigitalVideoDisc disc : itemsOrdered)
        {
            if (disc.isMatch(title))
            {
                System.out.println("FOUND: " + disc.toString());
                return;
            }
        }
        System.out.println("NOT FOUND");
    }

}
