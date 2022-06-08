package be.intecbrussel.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapApp {
    public static void main(String[] args) {
        Map<String, Integer> studentNameAndAgeMap = new HashMap<>();
        studentNameAndAgeMap.put("Jean-Axe", 20);
        studentNameAndAgeMap.put("Titeuf", 66);
        studentNameAndAgeMap.put("JeanJean", 2);

        studentNameAndAgeMap.putIfAbsent("Jean-Axe", 15);

        studentNameAndAgeMap.forEach((key, value) -> System.out.println("Name: " + key + " | Age: " + value));

        int titeufAge = studentNameAndAgeMap.getOrDefault("Ttiteuf", 9999);
        titeufAge = studentNameAndAgeMap.get("Titeuf");

        System.out.println(titeufAge);

        Set<String> studentNames = studentNameAndAgeMap.keySet();
        System.out.println(studentNames);

        Collection<Integer> studentAges = studentNameAndAgeMap.values();
        System.out.println(studentAges);

        Set<Map.Entry<String, Integer>> entrySet = studentNameAndAgeMap.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println("Name - " + stringIntegerEntry.getKey() + " age - " + stringIntegerEntry.getValue());
        }

        studentNameAndAgeMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 20);
    }

}
