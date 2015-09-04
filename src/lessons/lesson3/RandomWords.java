/**
 * Copyright © 2014, Oracle and/or its affiliates. All rights reserved.
 * 
 * JDK 8 MOOC Lesson 3 homework
 */
package lessons.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Class to generate a list of random words
 *
 * @author Simon Ritter (@speakjava)
 */
public class RandomWords {
    private final List<String> sourceWords;

    public static void main(String[] args) {
        try {
            new RandomWords();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Constructor
     * 
     * @throws IOException
     *             If the source words file cannot be read
     */
    public RandomWords() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("resources/words.txt"))) {
            // YOUR CODE HERE
            this.sourceWords = reader.lines()
                    .collect(Collectors.toList());

            System.out.println("Loaded " + this.sourceWords.size() + " words");
        }
    }

    /**
     * Create a list of a given size containing random words
     *
     * @param listSize
     *            The size of the list to create
     * @return The created list
     */
    public List<String> createList(int listSize) {
        Random rand = new Random();
        // YOUR CODE HERE
        List<String> wordList = rand.ints(listSize, 0, this.sourceWords.size())
                .mapToObj(this.sourceWords::get)
                .collect(Collectors.toList());

        return wordList;
    }

    /**
     * Return the list of all source words, which cannot be modified
     *
     * @return The unmodifiable list of all source words
     */
    public List<String> allWords() {
        return Collections.unmodifiableList(this.sourceWords);
    }
}