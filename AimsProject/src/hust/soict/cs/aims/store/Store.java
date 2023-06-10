package AimsProject.src.hust.soict.cs.aims.store;

import AimsProject.src.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

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
}
