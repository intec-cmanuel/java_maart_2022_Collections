package be.intecbrussel.queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class ShoppingApp {
    public static void main(String[] args) {
        Queue<String> shopperQueue = new LinkedList<>();
        shopperQueue.offer("Jean-Jaque");
        shopperQueue.offer("Jean-Luc");
        shopperQueue.offer("Jean-Turque");
        shopperQueue.offer("Jean-Minouche");
        shopperQueue.offer("Pierre-Jean");

        shopperQueue.forEach(System.out::println);

        System.out.println("-".repeat(80));

        IntStream.range(0, 3).forEach(number -> System.out.println(shopperQueue.peek()));

        System.out.println("-".repeat(80));

        IntStream.range(0, 3).forEach(number -> System.out.println(shopperQueue.poll()));



    }
}
