package AimsProject.src.hust.soict.cs.aims.disc;
import AimsProject.src.hust.soict.cs.Disc;
import AimsProject.src.hust.soict.cs.Playable;
import AimsProject.src.hust.soict.cs.aims.cart.Cart;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;

    public DigitalVideoDisc() {

    }


    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;

    }

    public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = nbDigitalVideoDiscs;
    }

    public String toString()
    {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

    public boolean isMatch(String title)
    {
        return this.title.equals(title);
    }

    public void play()
    {
        System.out.println(this.toString());
    }

    public static void main(String[] args)
    {
        //Create a new cart
        Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
                "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
                "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                18.99f);
        anOrder.addMedia(dvd3);

        //print total cost of the items in the cart
        System.out.print("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        //Test the displayCart method
        anOrder.displayCart();

    }

}
