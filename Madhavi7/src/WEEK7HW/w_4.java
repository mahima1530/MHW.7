package WEEK7HW;

import java.util.Scanner;

/*4. Take values of length and breadth of a rectangle from user and check if it is square or not.*/
public class w_4 {

    public static void main(String[] args) {
        ff();
    }


    public static void ff() {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the length:");
        int a = sr.nextInt();
        System.out.println("Enter the breadth");
        int b = sr.nextInt();

        if (a == b)
            {System.out.println("its a square:");}
        else
            {System.out.println("its a rectangle:");}

        System.out.println("status successful");
    }
}