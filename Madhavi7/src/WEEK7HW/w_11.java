package WEEK7HW;

import java.util.Scanner;

/*11. Write a program to print a string entered by user.*/
public class w_11 {
    public static void main(String[] args) {
        ss();
    }

    public static void ss(){
        String num;
                Scanner sn = new Scanner(System.in);

                System.out.print("Enter Your  Name : ");
                num = sn.nextLine();

                System.out.print("Hello, " + num);
            }
    }

