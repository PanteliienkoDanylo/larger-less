package ua.epam.block01.largerOrLess.controller;

public enum Command {

    /**
     * if input number < rand
     */
    LARGER("larger"),

    /**
     * if input number > rand
     */
    LESS("less"),

    /**
     * if input number == rand
     */
    WIN("win"),

    /**
     * if input not correct
     */
    NOT_CORRECT("not correct");

    /**
     * text of command
     */
    String text;

    /**
     * Constructor
     * @param text text of command
     */
    Command(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }

}
