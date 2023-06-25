package AimsProject.src.hust.soict.cs;
import AimsProject.src.hust.soict.cs.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost, List<String> authors) {
        super(id, title, category, cost);
        this.authors = authors;
    }

    public String toString()
    {
        return this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getCost() + "$";
    }

    public void addAuthor(String authorName)
    {
        if (!authors.contains(authorName))
        {
            authors.add(authorName);
            System.out.println("Success");
        }
        else
        {
            System.out.println("Already existed");
        }
    }

    public void removeAuthor(String authorName)
    {
        if (authors.contains(authorName))
        {
            authors.remove(authorName);
            System.out.println("Success");
        }
        else
        {
            System.out.println("Not exist");
        }
    }
}