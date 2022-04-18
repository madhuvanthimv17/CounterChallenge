package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import core.Counter;


/**
 * Test class to run unit test cases that verify implementation of countAndTransform() function
 * from Counter class
 */

public class AppTest {

    Counter counter = new Counter();

    @Test
    public void testOneCharacter(){
        System.out.print("\nTEST1 : Input with one alphabet : ");
        assertEquals("H", counter.countAndTransform("H"));
        assertEquals("a", counter.countAndTransform("a"));
        System.out.print("PASS");
    }

    @Test
    public void testOnlyNonAlphabet(){
        System.out.print("\nTEST2 : Input with only non-alphabet of any length: ");
        assertEquals(",,:! ]", counter.countAndTransform(",,:! ]"));
        assertEquals(",", counter.countAndTransform(","));
        assertEquals(":", counter.countAndTransform(":"));
        assertEquals(" ", counter.countAndTransform(" "));
        System.out.print("PASS");
    }

    @Test
    public void testOneWordOfLength2(){
        System.out.print("\nTEST3 : Input with one word of length 2 : ");
        assertEquals("I0t", counter.countAndTransform("It"));
        assertEquals("V0V", counter.countAndTransform("VV"));
        System.out.print("PASS");
    }

    @Test
    public void testOneWordOfLengthGreaterThan2(){
        System.out.print("\nTEST4 : Input with one word of length more than 2 : ");
        assertEquals("H1i", counter.countAndTransform("Hai"));
        assertEquals("c7c", counter.countAndTransform("comodogenic"));
        assertEquals("h2y", counter.countAndTransform("happy"));
        assertEquals("M6t", counter.countAndTransform("Microsoft"));
        System.out.print("PASS");
    }

    @Test
    public void testSentenceWithSingleTypeDelimiter(){
        System.out.print("\nTEST5 : Input sentence with the same type of delimiter : ");
        assertEquals("W4g y1u g1d l2k", counter.countAndTransform("Wishing you good luck"));
        assertEquals("H2e a f5c d1y", counter.countAndTransform("Have a fantastic day"));
        assertEquals("M6t:C6n", counter.countAndTransform("Microsoft:Corporation"));
        System.out.print("PASS");
    }

    @Test
    public void testSentenceWithMixedDelimiters(){
        System.out.print("\nTEST6 : Input sentence with multiple types of delimiters : ");
        assertEquals("W4g:y1u g1d]l2k!", counter.countAndTransform("Wishing:you good]luck!"));
        assertEquals("H2e'a+f5c;d1y", counter.countAndTransform("Have'a+fantastic;day"));
        assertEquals("M6t-C6n&", counter.countAndTransform("Microsoft-Corporation&"));
        System.out.print("PASS");
    }

    @Test
    public void testSentenceWithAdjacentDelimiters(){
        System.out.print("\nTEST7 : Input sentence with multiple delimiters adjacent to each other : ");
        assertEquals("W4g::y1u g1d]]]]l2k!", counter.countAndTransform("Wishing::you good]]]]luck!"));
        assertEquals("!{}[]H2e'a+f5c;d1y", counter.countAndTransform("!{}[]Have'a+fantastic;day"));
        assertEquals("M6t-C6n&@#", counter.countAndTransform("Microsoft-Corporation&@#"));
        System.out.print("PASS");
    }

    @Test
    public void testWordsWithSameLetters(){
        System.out.print("\nTEST8 : Input sentence with words composed of same characters throughout : ");
        assertEquals("a1a b1b c1c D1D", counter.countAndTransform("aaaaaa bbbbb cccc DDDDDD"));
        assertEquals("q1q!q0q:e1e", counter.countAndTransform("qqqqqqqqqqqqqqqq!qq:eeee"));
        System.out.print("PASS");
    }

    @Test
    public void testWordsWithMixedCase(){
        System.out.print("\nTEST9 : Input sentence with words composed of mixed case characters : ");
        assertEquals("C8s i0n g5y", counter.countAndTransform("CoOrdinates in gEomEtry"));
        assertEquals("C1X i0s r7g n1w", counter.countAndTransform("COX is recruitIng now"));
        System.out.print("PASS");
    }


}
