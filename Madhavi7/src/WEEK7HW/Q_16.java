package WEEK7HW;
/* 16. Write a Java program which input any number between 1 to 7 and it print The Daysname
MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch. NOTE: if
number is out of selection Print message “Week contains 1 to 7 days”*/

import java.util.Scanner;

public class Q_16 {
     /* switch(expression){
                    case lable1:
                         sout();
                         break;
                    case lable2:
                         sout();
                          break;
                    case lable n:
                        sout();
                         break;
                         default:
                         sout();*/

    public static void main(String[] args) {
        week();

    }


    public static void week() {
        Scanner SC = new Scanner(System.in);
        System.out.println("Input any number between 1 to 7:");
        int Days = SC.nextInt();

        switch (Days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Input");


        }

    }
}