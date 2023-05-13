package WEEK7HW;
/*7. Write a java program to input any number and find out if it’s odd or even.*/

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        num();
    }

    public static void num(){
        Scanner SC = new Scanner(System.in);
        System.out.println("Please enter a number");//scanner method
        int p = SC.nextInt();
        String result = p>0 && p<100?"Valid number": "please enter number value between 0 to 100";
        String result_2 =( p%2==0)?"even number": "odd number";
        System.out.println(p +   "is"  + result_2);

    }
}
