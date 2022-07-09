package lexicon.se;

import java.util.Random;

public enum Dice {
    DICE6(6),
    DICE10(10),
    DICE20(20),
    DICE100(100),
    ;
    private final int maxValue;

    Dice(int maxValue) {
        this.maxValue = maxValue;
    }
    public int roll(){
        Random random = new Random();
        int min = 1;
        int max = maxValue;
        int randnu = min+random.nextInt(max);
        return randnu;
    }

}
