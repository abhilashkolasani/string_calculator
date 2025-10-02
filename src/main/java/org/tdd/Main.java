package org.tdd;

public class Main {
    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        int resultWithNull = stringCalculator.add(null);
        int resultWithEmptyString = stringCalculator.add("");
        int resultWithSpaceString = stringCalculator.add(" ");
        int resultWithOneNumber = stringCalculator.add("1");
        int resultWithTwoNumbers = stringCalculator.add("1,2");
        int resultWithDefaultDelimiter = stringCalculator.add("//;\n1;2;3;4");

        System.out.println("resultWithNull: " + resultWithNull);
        System.out.println("resultWithEmptyString: " + resultWithEmptyString);
        System.out.println("resultWithSpaceString: " + resultWithSpaceString);
        System.out.println("resultWithOneNumber: " + resultWithOneNumber);
        System.out.println("resultWithTwoNumbers: " + resultWithTwoNumbers);
        System.out.println("resultWithDefaultDelimiter: " + resultWithDefaultDelimiter);

    }
}