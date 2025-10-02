package org.tdd;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isBlank()) {
            return 0;
        }
        else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }

        int indexOfNewLine = numbers.indexOf("\n");
        String[] numbersArray;
        if (numbers.startsWith("//")) {
            String delimiter = numbers.substring(2, indexOfNewLine);
            delimiter = delimiter.replace("][", "");
            numbersArray = numbers.substring(indexOfNewLine + 1).split(delimiter);
        } else {
            String delimiter = "[,\\n]";
            numbersArray = numbers.split(delimiter);
        }

        int sum = 0;
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (String number : numbersArray) {
            int value = number.isBlank() ? 0 : Integer.parseInt(number);
            if (value < 0) {
                negativeNumbers.add(value);
                continue;
            }
            if (value < 1000) {
                sum += value;
            }
        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + negativeNumbers);
        }
        return sum;
    }
}
