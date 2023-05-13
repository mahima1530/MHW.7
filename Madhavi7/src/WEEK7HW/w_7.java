package WEEK7HW;

import java.util.Scanner;

/*7. Take input of age of 3 people by user and determine oldest and youngest among
them.*/
public class w_7 {

    public static void main(String[] args) {
        users();
        users_1();
    }


    public static void users(){//check the youngest age

        Scanner A3 = new Scanner(System.in);
        System.out.print("Enter the Age of Madhavi :");
        int age1  = A3.nextInt();
        System.out.print("Enter the Age of Zeel:");
        int age2  = A3.nextInt();
        System.out.print("Enter the Age of Kahan  :");
        int age3  = A3.nextInt();
        if(age1<age2 && age1<age3)
            System.out.print("The Youngest Age is Madhavi");
        else if(age2<age1 && age2<age3)
            System.out.print("The Youngest Age is Zeel");
        else
            System.out.print("The Youngest Age is Kahan");
    }

    public static void users_1(){//check the oldest age

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Age of Madhavi :");
        int age1  = input.nextInt();
        System.out.print("Enter the Age of Zeel  :");
        int age2  = input.nextInt();
        System.out.print("Enter the Age of Kahan :");
        int age3  = input.nextInt();
        if(age1>age2 && age1>age3)
            System.out.print("The oldest Age is Madhavi");
        else if(age2>age1 && age2>age3)
            System.out.print("The oldest Age is Zeel");
        else
            System.out.print("The oldest Age is Kahan");
    }


    }

