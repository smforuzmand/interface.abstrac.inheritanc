package lexicon.se;

public class CalculatorConsole {
    private BasicMyCalculator calculator;

    public CalculatorConsole(BasicMyCalculator calculator) {
        this.calculator = calculator;
    }

    public void runnigMachine() {
        boolean runningMachine = true;

        while (runningMachine) {
            System.out.println("Insert first number:");
            double number1 = MyCalculator.getDoubleNumbers();
            System.out.println("Now second number:");
            double number2 = MyCalculator.getDoubleNumbers();
            System.out.println(" please choose the operator from / + - *  ");
            String operator = MyCalculator.getOperationFromUser();
            double result = calculator.calculator(number1, number2, operator);
            System.out.println(number1 + " " + operator + " " + number2 + " is " + result);
            System.out.println("Second Round? (Y/N)");
            String round = MyCalculator.getOperationFromUser();
            if (round.equalsIgnoreCase("n")) {
                runningMachine = false;
            }
        }


    }
}
