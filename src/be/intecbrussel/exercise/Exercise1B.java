package be.intecbrussel.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise1B {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        System.out.println("Please keep giving me words until it end with a .");
        List<String> myListOfStrings = new ArrayList<>();

        String word;
        do {
            word = keyboardReader.next();
            myListOfStrings.add(word);
        } while (!word.endsWith("."));

        myListOfStrings.forEach(System.out::println);

        for (int index =myListOfStrings.size()-1;index>=0;index--){
            System.out.println(myListOfStrings.get(index));
        }

//        Collections.reverse(myListOfStrings);
        StringBuilder sb = new StringBuilder();
        for (String myListOfString : myListOfStrings) {
            sb.append(new StringBuilder(myListOfString).reverse() + " ");
        }
        System.out.println(sb.reverse());

        Collections.reverse(myListOfStrings);
        System.out.println(myListOfStrings);
        Collections.reverse(myListOfStrings);

        System.out.println(myListOfStrings.size());

        String[] strArray = myListOfStrings.toArray(String[]::new);

//        String[] myStringArray = new String[myListOfStrings.size()-1];
//        myListOfStrings.stream().toArray();
//        for (String s:myStringArray) {
//
//        }

    }
}
