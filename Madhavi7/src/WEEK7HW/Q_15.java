package WEEK7HW;
/*15. Write a program that tells us input value is number or an alphabet or symbol. .*/

import java.util.Scanner;

public class Q_15 {

    public static void main(String[] args) {
        kk();
        yy();

    }


    public static void kk() {//value is alphabet
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter any alphabet:");

        char c = sd.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");


    }

    public static void yy() {//value is number
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sd.nextInt();
        if ((num >= 0 && num <= 50) || (num >= 0 && num <= 50))
            System.out.println(num + " is a number.");
        else
            System.out.println(num + " is not a number.");


    }


    }

