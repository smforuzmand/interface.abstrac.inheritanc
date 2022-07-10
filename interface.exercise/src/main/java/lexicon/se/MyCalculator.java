package lexicon.se;

import java.util.Scanner;

public abstract interface MyCalculator {
    public String summationSign = "+";
    public String subtractionSign = "-";
    public String multiplicationSign = "*";
    public String divisionSign = "/";
    Scanner sc = new Scanner(System.in);

    public static String getOperationFromUser() {
        return sc.nextLine();
    }

    public static double getDoubleNumbers() {
        boolean invalid = true;
        double number = 0;
        while (invalid) {
            try {
                number = Double.parseDouble(getOperationFromUser().replaceAll(",", "."));
                invalid = false;
            } catch (NumberFormatException ex) {
                System.out.println("not a correct format");
            }
        }
        return number;
    }

    public abstract double summation(double number1, double number2);

    public abstract double subtraction(double number1, double number2);

    public abstract double multiplication(double number1, double number2);

    public abstract double division(double number1, double number2);

    default double calculator(double num1, double num2, String operator) {
        double result = 0;

        switch (operator) {
            case summationSign:
                result = summation(num1, num2);
                break;
            case subtractionSign:
                result = subtraction(num1, num2);
                break;
            case multiplicationSign:
                result = multiplication(num1, num2);
                break;
            case divisionSign:
                result = division(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("mismatch operator" + operator);
        }
        return result;


    }


}



