/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 *
 * JDK 8 MOOC Lesson 1 homework
 */
package lessons.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Speakjava (simon.ritter@oracle.com)
 */
public class Lesson1 {
    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("JDK 8 Lambdas and Streams MOOC Lesson 1");
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     *
     * Create a string that consists of the first letter of each word in the
     * list of Strings provided.
     */
    private void exercise1() {
        List<String> list = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        /* YOUR CODE HERE */
        // HINT: Use a StringBuilder to construct the result.
        StringBuilder sb = new StringBuilder();
        list.forEach(s -> sb.append(s.charAt(0)));

        System.out.println("Exercise 1 => " + sb.toString());
    }

    /**
     * Exercise 2
     *
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        /* YOUR CODE HERE */
        // HINT: Use one of the new methods from JDK 8.
        list.removeIf(s -> s.length() % 2 != 0);

        System.out.println("Exercise 2 => " + list);
    }

    /**
     * Exercise 3
     *
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        /* YOUR CODE HERE */
        // HINT: Again, use one of the new methods from JDK 8.
        list.replaceAll(String::toUpperCase);

        System.out.println("Exercise 3 => " + list);
    }

    /**
     * Exercise 4
     *
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        /* YOUR CODE HERE */
        // HINT: Again, use a StringBuilder to construct the result String.
        // Use one of the new JDK 8 methods for Map
        StringBuilder sb = new StringBuilder();
        map.forEach((K, V) -> sb.append(K).append(V));

        System.out.println("Exercise 4 => " + sb.toString());
    }

    /**
     * Exercise 5
     *
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* YOUR CODE HERE */
        // HINT: This is a straightforward Lambda expression
        new Thread(() -> list.forEach(System.out::print)).start();

    }

    /**
     * Main entry point for application
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Lesson1 lesson = new Lesson1();
        lesson.runExercises();
        //        lesson.exercise10();
    }

    //    private void lesson2Example() {
    //        //List<Integer> list = Arrays.asList(1, 2, 3, -4, -5, -6, -7);
    //        //list.replaceAll(n -> Integer.signum(n));
    //        // list.replaceAll(Integer::signum);
    //        // System.out.println(list);
    //
    //        BufferedReader reader;
    //        try {
    //            reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(""))));
    //            List<String> output = reader
    //                    .lines()
    //                    .flatMap(line -> Stream.of(line.split("REGEXP")))
    //                    .filter(word -> word.length() > 0)
    //                    .collect(Collectors.toList());
    //            System.out.println("output = :" + output + ":");
    //        }
    //        catch (FileNotFoundException e) {
    //            // TODO Auto-generated catch block
    //            e.printStackTrace();
    //        }
    //
    //    }
}
