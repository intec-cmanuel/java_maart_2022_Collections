package be.intecbrussel.sets;

import java.util.*;
import java.util.stream.Collectors;

public class SortedApp {
    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        Box box2 = new Box(5, 10, 15);
        Box box3 = new Box(18, 9, 20);
        Box box4 = new Box(1, 1, 2);
        Box box5 = new Box(11, 6, 8);

//        Set<Box> myUniqueBoxes = new TreeSet<>(
//                new BoxLengthComparator().thenComparing((b1, b2) -> b1.getWidth() - b2.getWidth())
//        );

        Set<Box> myUniqueBoxes = new TreeSet<>(Comparator.comparingInt(box -> box.getWidth()));
//        Set<Box> myUniqueBoxes2 = new TreeSet<>(Comparator.comparing(box -> box.getWidth()));

        myUniqueBoxes.add(box1);
        myUniqueBoxes.add(box2);
        myUniqueBoxes.add(box3);
        myUniqueBoxes.add(box4);
        myUniqueBoxes.add(box5);


        List<Box> myUniqueBoxesSortedByVolume = myUniqueBoxes.stream()
                .sorted((b1, b2) -> b1.getVolume() - b2.getVolume())
                .collect(Collectors.toList());

        Set<Box> myUniqueBoxesSortedByVolume2 = myUniqueBoxes.stream()
                .distinct()
                .collect(Collectors.toCollection(() -> new TreeSet<Box>((b1, b2) -> b1.getVolume() - b2.getVolume())));

        System.out.println("SET:  " + myUniqueBoxes);
        System.out.println("SET:  " + myUniqueBoxesSortedByVolume);


    }
}
