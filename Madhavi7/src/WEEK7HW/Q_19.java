package WEEK7HW;
/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        pnz();
    }





    public static void pnz(){
        int a= 20;
        int b = -30;
        int c = 0;
        Scanner SC =new Scanner(System.in);
        System.out.println("Enter any number and check the result:");
        int num = SC.nextInt();
        //"check if number is positive , negative or zero:"


        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }

    }




