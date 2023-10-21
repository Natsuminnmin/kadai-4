package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("takagi");
        names.add("abe");
        names.add("kiki");
        names.add("watanabe");
        names.add("ono");

        List<String> result = names.stream().map(name -> name.toUpperCase()).filter(name -> name.contains("A")).toList();
        System.out.println(result);


        List<String> dogs = List.of("ai", "akua", "kaiji", "haruhi", "takuya", "jon");
        List<String> dog = dogs.stream().sorted().filter(String -> String.length() >= 5).toList();
        System.out.println(dog);


    }
}


