package ua.epam.block01.largerOrLess.model;


import ua.epam.block01.largerOrLess.controller.Command;

public class Model {

    /**
     * min value of range
     */
    private static final int MIN_NUMBER = 1;

    /**
     * max value of range
     */
    private static final int MAX_NUMBER = 99;

    /**
     * max number
     */
    private int max;

    /**
     * min number
     */
    private int min;

    /**
     * rand number
     */
    private int rand;

    /**
     * Constructor
     * Initialization max, min, and rand
     */
    public Model(){
        min = MIN_NUMBER;
        max = MAX_NUMBER;
        rand = rand(min, max);
    }

    /**
     * Get random number between min and max
     * @param min min range
     * @param max max range
     * @return
     */
    public int rand(int min, int max){
        return 1 + (int)(Math.random() * ((max - min)));
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getRand() {
        return rand;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    /**
     * Check input number with rand
     * @param number input number
     * @return Command
     */
    public Command checkNumber(int number){
        if(number == rand){
            return Command.WIN;
        }
        if(number > rand && number < max){
            max = number - 1;
            return Command.LESS;
        }
        if(number < rand && number > min){
            min = number + 1;
            return Command.LARGER;
        } else{
            return Command.NOT_CORRECT;
        }
    }

}
