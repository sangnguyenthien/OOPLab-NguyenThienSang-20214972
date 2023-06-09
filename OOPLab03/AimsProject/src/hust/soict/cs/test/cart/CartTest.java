package AimsProject.src.hust.soict.cs.test.cart;
import AimsProject.src.hust.soict.cs.aims.cart.Cart;
import AimsProject.src.hust.soict.cs.aims.disc.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);
        cart.addDigitalVideoDisc(dvd3);

        //Test the print method
        cart.displayCart();

        //Test the search by ID
        cart.searchByID(2);

        //Test the search by title
        cart.searchByTitle("The Lion King");
    }
}