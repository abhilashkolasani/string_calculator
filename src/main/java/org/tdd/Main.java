package org.tdd;

public class Main {
    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();
        int resultWithNull = stringCalculator.add(null);
        System.out.println("resultWithNull: " + resultWithNull);

        int resultWithEmptyString = stringCalculator.add("");
        System.out.println("resultWithEmptyString: " + resultWithEmptyString);

        int resultWithSpaceString = stringCalculator.add(" ");
        System.out.println("resultWithSpaceString: " + resultWithSpaceString);

        int resultWithOneNumber = stringCalculator.add("1");
        System.out.println("resultWithOneNumber: " + resultWithOneNumber);

        int resultWithTwoNumbers = stringCalculator.add("1,2");
        System.out.println("resultWithTwoNumbers: " + resultWithTwoNumbers);

        int resultWithDefaultDelimiter = stringCalculator.add("//;\n1;2;3;4");
        System.out.println("resultWithDefaultDelimiter: " + resultWithDefaultDelimiter);

        int resultWithNumbersGreaterThan1000 = stringCalculator.add("//;\n1;2;3000;4");
        System.out.println("resultWithNumbersGreaterThan1000: " + resultWithNumbersGreaterThan1000);

        int resultWithVariableLengthDelimiter = stringCalculator.add("//[***]\n1***2***3");
        System.out.println("resultWithVariableLengthDelimiter: " + resultWithVariableLengthDelimiter);

        int resultWithMultipleDelimiters = stringCalculator.add("//[*][%]\n5*5%2");
        System.out.println("resultWithMultipleDelimiters: " + resultWithMultipleDelimiters);

        int resultWithMultipleDelimitersWithVariableLength = stringCalculator.add("//[***][..][%%]\n5%%5***4%2..3.1");
        System.out.println("resultWithMultipleDelimitersWithVariableLength: " + resultWithMultipleDelimitersWithVariableLength);

        int resultWithNegativeNumbers = stringCalculator.add("//;\n1;-2;3;-4");
        System.out.println("resultWithNegativeNumbers: " + resultWithNegativeNumbers);

    }
}