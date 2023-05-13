package WEEK7HW;
/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
operator (? :)*/

import java.util.Scanner;
public class Q_1 {
    //syntax: condition?True: False;
    public static void main(String[] args) {
        jp();
    }

    public static void jp(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter a number");//scanner method
        int n = SC.nextInt();
        String result = n>0 && n<50?"Valid number": "please enter number value between 0 to 50";
        String result_1 =( n%2==0)?"even number": "odd number";
        System.out.println(n + "is" + result_1);





    }

}
