package be.intecbrussel.sets;

import java.util.*;
import java.util.stream.Collectors;

public class BoxApp {
    public static void main(String[] args) {
        Box box1 = new Box(10,10,10);
        Box box2 = new Box(5,10,15);
        Box box3 = new Box(18,9,20);
        Box box4 = new Box(5,10,15);

        List<Box> myBoxes = new ArrayList<>();
        myBoxes.add(box1);
        myBoxes.add(box2);
        myBoxes.add(box3);
        myBoxes.add(box4);

        myBoxes = myBoxes.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("LIST: " + myBoxes);

        Set<Box> myUniqueBoxes = new LinkedHashSet<>();
        myUniqueBoxes.add(box1);
        myUniqueBoxes.add(box2);
        myUniqueBoxes.add(box3);
        myUniqueBoxes.add(box4);

        System.out.println("SET:  " + myUniqueBoxes);

        Box box5 = new Box(1,1,2);
        myUniqueBoxes.add(box5);
        Box box6 = new Box(11,6,8);
        myUniqueBoxes.add(box6);

        System.out.println("SET2: " + myUniqueBoxes);
    }
}
