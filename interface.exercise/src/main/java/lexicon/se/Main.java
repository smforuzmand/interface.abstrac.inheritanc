package lexicon.se;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BasicMyCalculator basicMyCalculator=new BasicMyCalculator();
        CalculatorConsole calculatorConsole = new CalculatorConsole(basicMyCalculator);
        calculatorConsole.runnigMachine();

    }
}
