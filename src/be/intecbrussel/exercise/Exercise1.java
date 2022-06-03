package be.intecbrussel.exercise;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Give me a number");
            int value = scanner.nextInt();
            list.add(value);
        }

        list.forEach((Integer number) -> System.out.print(number + ", "));
        System.out.println(list);

//        int sum = 0;
//        for (Integer number : list) {
//            sum += number;
//        }

        int sum = list.stream()
                .mapToInt(number -> number)
                .sum();

        int sumReduced = list.stream()
                .reduce(0, (total, intFromList) -> total + intFromList);


        int sumReducedMethodReference = list.stream()
                .reduce(0, Integer::sum);

//        double fastAverage = ((double)sum) / list.size();
//        System.out.println(fastAverage);

        OptionalDouble average = list.stream()
                .mapToInt(number -> number)
                .average();

        if (average.isPresent()) {
            System.out.println("\n " + average.getAsDouble());
        }




//        System.out.println("\n" + sum);
    }
}
