package org.tdd;

public class Main {
    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        int resultWithNull = stringCalculator.add(null);
        int resultWithEmptyString = stringCalculator.add(" ");
        System.out.println("resultWithNull: " + resultWithNull);
        System.out.println("resultWithEmptyString: " + resultWithEmptyString);

    }
}