package AimsProject.src.hust.soict.cs.aims.store;

import AimsProject.src.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Store {
    public ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media... MediaList)
    {
        for(Media obj : MediaList)
        {
            itemsInStore.add(obj);
        }
        System.out.println("Success!");
    }

    public void removeMedia(Media... MediaList)
    {
        for(Media obj : MediaList)
        {
            itemsInStore.remove(obj);
        }
        System.out.println("Success!");
    }

    public void storeDisplay() {
        System.out.println("Store:");
        System.out.println("-----------------------------");
        int i = 1;
        for (Media media : itemsInStore) {
            System.out.print(i+". ");
            System.out.println(media);
            i+=1;
        }
        System.out.println("-----------------------------");
    }
}
