package WEEK7HW;
/*1. Take 10 integers from keyboard using loop and print their average value on the
screen.*/

import java.util.Scanner;

public class w_1 {

    public static void main(String[] args) {
        keyboard();
    }


    public static void keyboard(){


        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i<=10; i++ ) {
            System.out.println("Enter number ");
            sum = sum + sc.nextInt();
        double average = sum/10;
        }
        System.out.println("Avg is : "+ sum/10);

}

}
