package lexicon.se;

public class BasicMyCalculator implements MyCalculator {


    @Override
    public double summation(double number1, double number2) {
        return number1+number2;
    }

    @Override
    public double subtraction(double number1, double number2) {
        return number1-number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1*number2;
    }

    @Override
    public double division(double number1, double number2) {
        return number1/number2;
    }
}
