package AimsProject.src.hust.soict.cs.aims;

import AimsProject.src.hust.soict.cs.Book;
import AimsProject.src.hust.soict.cs.CompactDisc;
import AimsProject.src.hust.soict.cs.Disc;
import AimsProject.src.hust.soict.cs.Track;
import AimsProject.src.hust.soict.cs.aims.cart.Cart;
import AimsProject.src.hust.soict.cs.aims.disc.DigitalVideoDisc;
import AimsProject.src.hust.soict.cs.aims.media.Media;
import AimsProject.src.hust.soict.cs.aims.store.Store;

import java.util.ArrayList;
import java.util.Scanner;


public class Aims {
    public static  void  addMedia(Cart cart, Store store) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type (DVD,Book,CD) :");
        String type = sc.next();
        System.out.print("Id: ");
        int id = sc.nextInt();
        System.out.print("Title: ");
        String title = sc.next();
        System.out.print("Category: ");
        String category = sc.next();
        System.out.print("Cost: ");
        float cost = sc.nextFloat();
        if (type.equals("DVD")) {
            System.out.print("Length: ");
            int length = sc.nextInt();
            System.out.print("Director: ");
            String director = sc.next();
            if (type.equals("DVD")) {
                store.addMedia(new DigitalVideoDisc(title, category, director, length, cost));
            }
            if (type.equals("Disc")) {
                store.addMedia(new Disc(id, title, category, cost, director, length));
            }
        }
        if (type.equals("Book")) {
            ArrayList<String> authors = new ArrayList<String>();
            System.out.print("Number of authors: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("   +Author " + (i + 1) + ": ");
                authors.add(sc.next());
            }
            store.addMedia(new Book(id, title, category,cost,authors));
        }
        if(type.equals("CD")){
            System.out.print("Director: ");
            String director = sc.next();
            System.out.print("Artist: ");
            String artist = sc.next();
            ArrayList<Track> tracks = new ArrayList<Track>();
            System.out.print("Number of tracks: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Track " + (i + 1) + ": ");
                System.out.print("   +Title: ");
                String title1= sc.next();
                System.out.print("   +Length: ");
                int length1= sc.nextInt();
                tracks.add(new Track(title1,length1));
            }

            store.addMedia(new CompactDisc(id, title, category,director,artist,tracks,cost));
        }
        System.out.println("Added successfully!");
    }
    public static  void removeMedia(Cart cart , Store store){
        store.storeDisplay();
        System.out.print("Type the index of media will be removed: ");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        store.itemsInStore.remove(store.itemsInStore.get(n - 1));
        System.out.println("Removed successfully!");
    }
    public static void showMenu(Cart cart,Store store) {
        System.out.println("AIMS:");
        System.out.println("--------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------");
        System.out.println("Please choose a number : 0-1-2-3");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                storeMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 2) {
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 3) {
                cartMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                System.exit(0);
            }

        }
    }
    public static void storeUpdate(Cart cart,Store store){
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Add a media");
        System.out.println("2. Remove a media");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        while (true) {
            if (option == 1) {
                addMedia(cart,store);
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 2) {
                removeMedia(cart,store);
                storeUpdate(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                showMenu(cart,store);
                break;
            }
        }
    }
    public static  void storeMenu(Cart cart,Store store) {
        store.storeDisplay();
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        while (true) {
            if (option == 1) {
                mediaDetailsMenu(cart, store);
                storeMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 2) {
                System.out.print("Please enter the media's title will be added :");
                String title= sc.next();
                boolean check=false;
                Media media1= new DigitalVideoDisc();
                while (check==false) {
                    for (Media media : store.itemsInStore) {
                        if (media.getTitle().equals(title)) {
                            check = true;
                            media1=media;
                        }
                    }
                    if(!check){
                        System.out.print("Invalid, please enter again :");
                        title= sc.next();
                    }
                    cart.addMedia(media1) ;
                }
                storeMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 3) {
                System.out.print("Please enter the media's title will be displayed :");
                String title = sc.next();
                boolean check = false;
                while (check == false) {
                    for (Media media : store.itemsInStore) {
                        if (media.getTitle().equals(title)) {
                            check = true;
                            System.out.print(media);

                        }
                    }
                    if (!check) {
                        System.out.print("Invalid, please enter again :");
                        title = sc.next();
                    }
                    option = sc.nextInt();
                }
            }
            if (option == 4) {
                cart.displayCart();
                cartMenu(cart,store);
                option = sc.nextInt();
            }
            if (option == 0) {
                showMenu(cart, store);
            }
        }
    }
    public static void mediaDetailsMenu(Cart cart,Store store){
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu(Cart cart,Store store){
        System.out.println("Options:");
        System.out.println("-----------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("-----------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");

    }
    public static void main(String args[]){
        Store store=new Store();
        DigitalVideoDisc dvd1=new DigitalVideoDisc(1,"Thien Long bat bo","abc","Ko biet",3,5.5f);
        DigitalVideoDisc dvd2=new DigitalVideoDisc(2,"Bao Thanh Thien","Trien Chieu","Khai Phong",6,5f);
        DigitalVideoDisc dvd3=new DigitalVideoDisc(6,"Khong ro","Sang NT","abcd",33,6.5f);
        DigitalVideoDisc dvd4=new DigitalVideoDisc(3,"Zombie","Noname","efgh",43,9.5f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);

        Scanner sc=new Scanner(System.in);
        Cart cart=new Cart();
        showMenu(cart,store);

    }
}
