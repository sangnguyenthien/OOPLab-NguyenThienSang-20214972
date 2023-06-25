package AimsProject.src.hust.soict.cs;

import AimsProject.src.hust.soict.cs.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media media1, Media media2) {
        int titleComparison = media1.getTitle().compareTo(media2.getTitle());
        if (titleComparison != 0) {
            // If titles are different, return the comparison result
            return titleComparison;
        } else {
            // If titles are the same, sort by cost
            return Double.compare(media2.getCost(), media1.getCost());
            // Note: We are reversing the comparison for cost (media2 vs media1) to achieve higher cost first
        }
    }
}