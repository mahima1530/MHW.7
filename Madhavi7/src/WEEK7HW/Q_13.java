package WEEK7HW;
/* 13. Write a java program to input any two number and ask user to enter their
symbol (+, -, /, *)find addition, Subtraction, multiplication and division
 according to theirsymbol(using if else)*/

import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {
                num();
    }


    public static void num(){
        int a = 5;
        int b = 10;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter one number:");
        int ab = SC.nextInt();
        System.out.println("Enter second number:");
        int ab_1 = SC.nextInt();
        System.out.println("their symbols: +,-,*,/ ");


        //Arithmetic Operator (+, -, *, /)
        if(ab=='+');//addition
        else if (ab=='-');//subtraction
        else if (ab=='*');//multiplication
        else if(ab=='/');//divided

        System.out.println("Addition of a and b is " +(a+b)); // +

        System.out.println("Subtraction of b and a is " +(b-a)); // -

        System.out.println("Multiplication of a and b is " +(a*b)); // *

        System.out.println("Division of b and a is " +(b/a)); // /










    }


}
