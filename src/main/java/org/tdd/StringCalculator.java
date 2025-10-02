package org.tdd;

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
        for (String number : numbersArray) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }

}
