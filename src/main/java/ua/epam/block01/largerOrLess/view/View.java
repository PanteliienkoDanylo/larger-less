package ua.epam.block01.largerOrLess.view;

import ua.epam.block01.largerOrLess.controller.Command;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class View {


    private BufferedReader bufferedReader;
    private InputStreamReader inputStreamReader;

    /**
     * Constructor
     */
    public View() {
        inputStreamReader = new InputStreamReader(System.in);
        bufferedReader = new BufferedReader(inputStreamReader);
    }

    /**
     * Get input number
     * @return input number
     */
    public int getNumber(){
        int number = 0;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception e){
            print(Command.NOT_CORRECT.getText());
        }
        return number;
    }

    /**
     * Exit of application
     */
    public void exit(){
        System.exit(0);
    }

    /**
     * Print text
     * @param text text
     */
    public void print(String text){
        System.out.println(text);
    }

    /**
     * Print range between min and max
     * @param min min value of range
     * @param max max value of range
     */
    public void printMinAndMax(int min, int max){
        System.out.println("Enter number [" + min + ":" + max + "]");
    }
}
