package be.intecbrussel.sets;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedApp {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(5,10,15);
        Box box3 = new Box(18,9,20);
        Box box4 = new Box(1,1,2);
        Box box5 = new Box(11,6,8);

//        Set<Box> myUniqueBoxes = new TreeSet<>(
//                new BoxLengthComparator().thenComparing((b1, b2) -> b1.getWidth() - b2.getWidth())
//        );

        Set<Box> myUniqueBoxes = new TreeSet<>(Comparator.comparingInt(box -> box.getWidth()));
        Set<Box> myUniqueBoxes2 = new TreeSet<>(Comparator.comparing(box -> box.getWidth()));

        myUniqueBoxes.add(box1);
        myUniqueBoxes.add(box2);
        myUniqueBoxes.add(box3);
        myUniqueBoxes.add(box4);
        myUniqueBoxes.add(box5);

        System.out.println("SET:  " + myUniqueBoxes);
    }
}
