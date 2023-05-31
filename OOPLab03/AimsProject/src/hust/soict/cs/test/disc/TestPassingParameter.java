package AimsProject.src.hust.soict.cs.test.disc;

import AimsProject.src.hust.soict.cs.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;

public class TestPassingParameter {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        //Swap
        ArrayList<Object> list = swap(jungleDVD, cinderellaDVD);
        jungleDVD = (DigitalVideoDisc) list.get(0);
        cinderellaDVD = (DigitalVideoDisc) list.get(1);

        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static ArrayList<Object> swap(Object o1, Object o2)
    {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
        ArrayList<Object> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        return list;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
