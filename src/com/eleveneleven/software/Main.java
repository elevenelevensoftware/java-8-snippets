package com.eleveneleven.software;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {


    }

    /**
     * @param number
     * @return the sum of all multiples of a given range
     */
    public static int getMultiplesOf(int number) {

        int[] multiples = {3, 5};

        IntStream inputNumbers = IntStream.rangeClosed(0, (number - 1))
                .filter(i -> IntStream.of(multiples).anyMatch(x -> i % x == 0));

        return inputNumbers.sum();
    }

    /**
     * Reversing an array using collections and returned as holding primitives using streams
     *
     * @param data
     * @return a reversed array of primitive integers
     */
    public static int[] DataReverse(int[] data) {

        List<Integer> list = Arrays
                .stream(data)
                .boxed()
                .collect(Collectors.toList());

        Collections.reverse(list);

        return list
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
