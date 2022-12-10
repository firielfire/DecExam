// **********************************************************************
// Programmer:  Hugh
// Class:       CS30S
//
// Assignment:  CS30S April Exam 2021
//
// Description: add you description of this program
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class CS30SDecemberExamRationalClient
{  // begin class
    public static void main(String[] args) throws IOException
    {  // begin main
        // ***** declaration of constants *****

        // ***** declaration of variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();              

        // ***** create objects *****

        // ***** create input stream *****

        /* Add a try catch so that the program won't crash if the file is not found */
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));

        /* *********************** Part a ************************** */

        System.out.println();
        System.out.println("---- Part A Basic Rationsl ----" + nl);

        Rational rational1 = new Rational(2, 7);
        Rational rational2 = new Rational();
        
        System.out.println("Rational 1: " + rational1);
        System.out.println("Rational 2: " + rational2);
        
        rational2.setNumerator(3);
        rational2.setDenominator(8);        
        System.out.println("Rational 2: " + rational2);

        rational2.setDenominator(0);        
        System.out.println("Rational 2: " + rational2);
        
        
        // ***** closing message *****
        
        System.out.println("end of program");
    }  // end main  
}  // end class