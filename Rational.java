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

public class Rational
{  // begin class
    
    private int numerator;
    private int denominator;
    
    // no-arg constructor
    public Rational (){
        this.numerator = 0;
        this.denominator = 1;
    } // end no-arg constructor
    // full-arg constructor
    public Rational (int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    } // end full-arg constructor
    
    // getters
    public int getNumerator(){
        return this.numerator;
    } // end getNumerator
    public int getDenominator(){
        return this.denominator;
    } // end getDenominator
    
    // setters
    public void setNumerator (int setNum) {
        numerator = setNum;
    } // end setNumerator
    public void setDenominator (int setDen) {
        denominator = setDen;
    } // end setDenominator
    
    @Override
    public String toString(){
        String s = getNumerator() + "/" + getDenominator();
        return s;
    } // end toString
}
  // end class
