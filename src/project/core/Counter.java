package core;

import java.util.HashSet;

/**
 * Class to perform the core functionality of counting the number of distinct characters,
 * to construct the output in the format : first_letter count last_letter
 * and cushion it with delimiters at the right locations
 */
public class Counter {

    private StringBuilder output;

    public Counter(){
        this.output = new StringBuilder();
    }

    /**
     * Function to transform each word into the desired format : 
     * <firstcharacter><count of distinct characters in between><lastcharacter>
     * 
     * @param originalWordList array of words in the input sentence
     * @return array of transformed words
     */
    private String[] doCountAndTransformForWords(String[] originalWordList){
        String[] transformedWords = new String[originalWordList.length];

        //Iterate through the word list
        for(int index=0; index<originalWordList.length; index++){

            int len = originalWordList[index].length();

            //Case: The word is blank due to non-alphabetic character(s) at the start or end of the input sentence
            if(len == 0){
                transformedWords[index] = "";
            }
            //Case: The word is just one character long
            else if(len == 1){
                transformedWords[index] = String.valueOf(originalWordList[index].charAt(0));
            }
            else{
                //First and last characters of each word
                char first = originalWordList[index].charAt(0);
                char last = originalWordList[index].charAt(len-1);
                HashSet<Character> distinctLettersInAWord = new HashSet<Character>();

                for(int i=1; i<len-1; i++){
                    distinctLettersInAWord.add(Character.toLowerCase(originalWordList[index].charAt(i)));
                }
                transformedWords[index] = String.valueOf(first) + String.valueOf(distinctLettersInAWord.size()) + String.valueOf(last);
            }
            
        }
        return transformedWords;
    }
    
    /**
     * Function to initiate finding count of distinct characters in every word and 
     * construct the desired output
     * 
     * @param input Input string from user
     * @return Output string in the desired format
     */
    public String countAndTransform(String input){
        
        //Split input sentence into words separated by one or more non-alphabetic characters
        String[] originalWordList = input.split("[^a-zA-Z]+"); 
        String[] transformedWords = doCountAndTransformForWords(originalWordList);

        char[] inputString = input.toCharArray();
        this.output.setLength(0);
        int wordIndex = 0;

        //Iterate through the input sentence character by character
        for(int charIndex=0; charIndex<inputString.length; ){

            //Case: Alphabet
            if(Character.isAlphabetic(inputString[charIndex])){ 
                if("".equals(transformedWords[wordIndex])){
                    wordIndex += 1;
                }
                output.append(transformedWords[wordIndex]);
                    
                charIndex = charIndex + originalWordList[wordIndex].length();
                wordIndex += 1;
            }
            //Case: Non-alphabet
            else{
                output.append(inputString[charIndex]);
                charIndex += 1;
            }
        }
        return output.toString();
        
    }

    
}

