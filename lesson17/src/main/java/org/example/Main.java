package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 100;
            numbers.add((int) random);
        }
        System.out.println(numbers);

        List<Integer> notDublicate = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(notDublicate);

        List<Integer> range = numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num >= 7 && num <= 17)
                .collect(Collectors.toList());
        System.out.println(range);

        List<Integer> multiplied2 = numbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println(multiplied2);

        List<Integer> sortedFourElements = numbers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(sortedFourElements);

        long count = numbers.stream()
                .count();
        System.out.println(count);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(average);
    }
}