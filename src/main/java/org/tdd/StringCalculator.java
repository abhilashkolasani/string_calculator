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
        String delimiter = numbers.startsWith("//") ? numbers.substring(2, indexOfNewLine) : "[,\n]";
        String[] numbersArray = numbers.substring(indexOfNewLine + 1).split(delimiter);

        int sum = 0;
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        for (String number : numbersArray) {
            if (Integer.parseInt(number) < 0) {
                negativeNumbers.add(Integer.parseInt(number));
                continue;
            }

            sum += Integer.parseInt(number);

        }

        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + negativeNumbers);
        }
        return sum;
    }

}
