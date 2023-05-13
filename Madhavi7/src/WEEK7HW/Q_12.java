package WEEK7HW;

import java.util.Scanner;
/* 11. Input any alphabet from “A" to “F” and print their city name accordingly
(use if else) if any
 other alphabet should be invalid entry.*/


/*12. Same as above program-11 using switch statement.*/
public class Q_12 {

    public static void main(String[] args) {
        cn();
    }


    public static void cn() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter any alphabet from A TO F ");
        char city = ss.next().charAt(0);


        switch (city)
        {
            case 'A' :
            {System.out.println("Aberdeen");}
            break;

            case 'B':
            {System.out.println("Belfast");}
            break;

            case 'C':
            {System.out.println("Cambridge");}
            break;

            case 'D':
            {System.out.println("Durham");}
            break;

            case 'E':
            {System.out.println("Ely");}
            break;

            case 'F':
            {System.out.println("Florida");}
            break;

            default:
                System.out.println("Invalid Input");








        }
    }
}