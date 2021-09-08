package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {

    int coverage = 350;
    App ask = new App();
    App calc = new App();
    int l = ask.length();
    int w = ask.width();
    int sqft = calc.calcAmount(l,w);
    int needs = calc.gallonsNeeded(sqft,coverage);

        System.out.println( String.format("You will need to purchase %d gallons of paint to cover %d square feet.",needs,sqft) );
    }

    private int length(){
        out.print("what is the length of the space? ");
        return in.nextInt();
    }
    private int width(){
        out.print("what is the width of the space? ");
        return in.nextInt();
    }
    private int calcAmount(int l, int w){
        return l*w;
    }
    private int gallonsNeeded(int sqft,int coverage){
        if(sqft%coverage >0){
           return (sqft/coverage)+1;
        }
        else{
            return sqft/coverage;
        }
    }
}
