package WEEK7HW;
/* 11. Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if any
 other alphabet should be invalid entry.*/

import java.util.Scanner;

public class Q_11 {

    public static void main(String[] args) {
        c_name();
    }


    public static void c_name() {
        Scanner gc = new Scanner(System.in);
        System.out.println("Enter any alphabet from A TO F");
        char c = gc.next().charAt(0);
        if (c == 'A')
                 {System.out.println("Aberdeen");}

        else if (c=='B')
                 {System.out.println("Belfast");}

        else if (c=='C')
                 {System.out.println("Cambridge");}

        else if (c=='D')
                 {System.out.println("Durham");}

        else if (c=='E')
                 {System.out.println("Ely");}

        else if (c=='F')
                 {System.out.println("Florida");}


    }
}
