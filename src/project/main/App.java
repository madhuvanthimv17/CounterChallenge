package main;

import exception.InvalidArgumentException;
import handler.InputOutputHandler;

/**
 * The App is a program that parses a sentence and replaces each word with the following: 
 * first letter, number of distinct characters between first and last character, and last letter
 * 
 * @author Madhuvanthi Mohan Vijayamala
 * @version 1.0
 * @since 2022-04-16
 */
public class App {
    public static void main(String[] args){
        InputOutputHandler handler = new InputOutputHandler();
        try{
            handler.execute(args);
        }
        catch(InvalidArgumentException ex){
            System.out.println(ex.getMessage());
        }
       
    }
}
