package pl;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        System.out.println("Zadanie 1: " + task1());
        System.out.println("Zadanie 2: " + task2());
        System.out.println("Zadanie 3: " + task3());
    }

    // Zadanie 1: Obliczenie średniej bez liczb kończących się na 9 lub 7
    public static double task1() {
        List<Integer> numbers = List.of(45, 39, 17, 25, 10, 4);
        return numbers.stream()
                .filter(n -> n % 10 != 9 && n % 10 != 7)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    // Zadanie 2: Liczby podniesione do kwadratu + 9, pomijając wyniki zawierające cyfrę 9
    public static List<Integer> task2() {
        List<Integer> numbers = List.of(3, 10, 9, 4);
        return numbers.stream()
                .map(n -> n * n + 9)
                .filter(result -> !String.valueOf(result).contains("9"))
                .collect(Collectors.toList());
    }

    // Zadanie 3: Dodanie "y" na końcu stringa, pomijając te z "yy"
    public static List<String> task3() {
        List<String> strings = List.of("aa", "cy", "b", "yycd", "c");
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}