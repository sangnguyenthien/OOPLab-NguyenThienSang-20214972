package AimsProject.src.hust.soict.cs;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();;

    public String getArtist() {
        return artist;
    }


    public CompactDisc(int id, String title, String category, float cost, String director, int length, String artist, ArrayList<Track> tracks) {
        super(id, title, category, cost, director, length);
        this.artist = artist;
        this.tracks = tracks;
    }

    public  CompactDisc(int id,String title,String category,String director,String artist,ArrayList<Track> tracks,float cost) {
        this.category = category;
        this.director = director;
        this.artist = artist;
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.tracks = tracks;
    }
    public void addTrack(Track a_track)
    {
        if (!tracks.contains(a_track))
        {
            tracks.add(a_track);
            System.out.println("Success");
        }
        else
        {
            System.out.println("Already existed");
        }
    }

    public void removeTrack(Track a_track)
    {
        if (tracks.contains(a_track))
        {
            tracks.remove(a_track);
            System.out.println("Success");
        }
        else
        {
            System.out.println("Not found");
        }
    }

    public int getLength()
    {
        int sum = 0;
        for(Track a : tracks)
        {
            sum += a.getLength();
        }

        return sum;
    }

    public String toString()
    {
        return "Artist: " + this.getArtist() + ", length: " + this.getLength();
    }

    public void play()
    {
        System.out.println("Artist: " + this.getArtist() + ", length: " + this.getLength());

        int i = 1;
        for (Track track : tracks)
        {
            System.out.print("Track " + i + ": ");
            track.play();
            i += 1;
        }
    }
}


