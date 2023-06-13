package AimsProject.src.hust.soict.cs.aims.media;

import AimsProject.src.hust.soict.cs.MediaComparatorByCostTitle;
import AimsProject.src.hust.soict.cs.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    public static final Comparator<Media> COMPARE_BY_COST_TITLE= new MediaComparatorByCostTitle() ;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST= new MediaComparatorByTitleCost() ;
    protected int id;
    protected String title;
    protected String category;
    protected float cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media()
    {

    };
}
