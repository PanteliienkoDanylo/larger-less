package ua.epam.block01.largerOrLess.controller;

import ua.epam.block01.largerOrLess.model.Model;
import ua.epam.block01.largerOrLess.view.View;

public class Controller {

    /**
     * Model
     */
    private Model model;

    /**
     * View
     */
    private View view;

    /**
     * Constructor
     */
    public Controller(){
        model = new Model();
        view = new View();
    }

    /**
     * Print start message
     */
    public void start(){
        view.printMinAndMax(model.getMin(), model.getMax());
        checkInputNumber();
    }

    /**
     * Check input number and do something
     */
    public void checkInputNumber(){
        do{
            int number = view.getNumber();
            switch (model.checkNumber(number)){
                case LARGER:
                    view.print(Command.LARGER.getText());
                    view.printMinAndMax(model.getMin(), model.getMax());
                    break;
                case LESS:
                    view.print(Command.LESS.getText());
                    view.printMinAndMax(model.getMin(), model.getMax());
                    break;
                case WIN:
                    view.print(Command.WIN.getText());
                    view.exit();
                    break;
                case NOT_CORRECT:
                    view.print(Command.NOT_CORRECT.getText());
                    view.printMinAndMax(model.getMin(), model.getMax());
                    break;
            }
        }while(true);
    }
}
