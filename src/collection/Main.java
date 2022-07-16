package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10, 15, 20, 250, 30, 35, 40, 45, 50));
        System.out.println(list);
        int max = 0;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println(max);
        System.out.println(Collections.max(list));
        System.out.println();

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Vigen", "Arevik", "Gor", "Sokrat",
                "Karen", "Edgar", "Sergey", "Georgi"));
        for (String s : names) {
            if (s.length() < 4) {
                System.out.println(s);
            }
        }
    }
}