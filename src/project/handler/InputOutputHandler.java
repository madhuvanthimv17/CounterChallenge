package handler;

import core.Counter;
import exception.InvalidArgumentException;

/**
 * Class InputOutputHandler handles processing input, delegates the responsibility of calculating count to Count class
 * and prints output
 * 
 */
public class InputOutputHandler {
    private Counter counter;
    private String output;

    public InputOutputHandler(){
        this.counter = null;
        this.output = "";
    }

    /**
     * Function to call the counter from Count class and print output
     * @param input Input string from user
     * @return Nothing
     */
    private void invokeCounter(String input){
        if(counter == null){
            counter = new Counter();
        }
        output = counter.countAndTransform(input);
        System.out.println("Output : " + output);
    }


    /**
     * Function to validate number of input command line arguments
     * @param args Array of command line arguments (includes input string)
     * @return true if 1 argument is present, else false
     */
    private boolean validateArgument(String[] args){
        if(args != null && args.length == 1){
            return true;
        }
        return false;
    }

    /**
     * Function that serves as an entry point to input and output handling
     * @param args Array of command line arguments
     * @return Nothing
     * @throws InvalidArgumentException if there are no arguments or more than required number of arguments
     */
    public void execute(String[] args) throws InvalidArgumentException{

        if(validateArgument(args)){
            System.out.println("\nInput : "+ args[0]);

            //If input is of length one character, print output as such4
            if(args[0].length() == 1){
                System.out.println("Output : "+ args[0]);
            }
            else{
                invokeCounter(args[0]); 
            }
        }
        else{
            throw new InvalidArgumentException("Please provide a sentence as a valid argument and re-run the program");
        }
       
    }
}

