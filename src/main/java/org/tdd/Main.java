package org.tdd;

public class Main {
    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        int resultWithNull = stringCalculator.add(null);
        int resultWithEmptyString = stringCalculator.add("");
        int resultWithSpaceString = stringCalculator.add(" ");
        int resultWithOneNumber = stringCalculator.add("1");
        int resultWithTwoNumbers = stringCalculator.add("1,2");

        System.out.println("resultWithNull: " + resultWithNull);
        System.out.println("resultWithEmptyString: " + resultWithEmptyString);
        System.out.println("resultWithEmptyString: " + resultWithSpaceString);
        System.out.println("resultWithEmptyString: " + resultWithOneNumber);
        System.out.println("resultWithEmptyString: " + resultWithTwoNumbers);

    }
}