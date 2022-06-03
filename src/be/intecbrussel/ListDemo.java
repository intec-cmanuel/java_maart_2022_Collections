package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Jean-bon");
//        stringList.add(1, "INDEX 1");
        stringList.add(2, "INDEX 2");
        stringList.set(0, "Goodbye");
        stringList.remove(2);
        stringList.remove("Jean-bon");
        stringList.removeIf(word -> word.contains("oo"));
        System.out.println(stringList.size());
        stringList.clear();
        stringList.add("Muhammed");
        stringList.add(",");
        stringList.add("bone apple tea");
        System.out.println(stringList.get(2));
        int firstInstanceOfComma = stringList.indexOf(",");
        stringList.set(firstInstanceOfComma, "Akxsel");

        // !!! BIJ GEBRUIK VAN CONTAINS, MOET JE DE EQUALS METHODE IMPLEMENTEREN
        System.out.println(stringList.contains("Muhammed"));

        stringList.forEach(sentence -> System.out.print(sentence+" "));

    }
}
