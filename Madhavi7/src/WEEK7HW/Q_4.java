package WEEK7HW;
/* 4. Write if else condition and print your group name -
in console else others group name.*/

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        g_num();
    }


    public static void g_num(){

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter your group name:");
        String fe = SC.nextLine();
        String fc= "postman";
        String fg = "Selenium"; String fh = "Java";
        if (fe.equalsIgnoreCase(fc)){
            System.out.println("welcome to postman group");
        }
        else if (fe.equalsIgnoreCase(fg))
        {
            System.out.println("please join to selenium group");}


        else if (fe.equalsIgnoreCase(fh))
        {
            System.out.println("please join to java group");

        }
        else {
            System.out.println("Thank you for joining group");
        }


    }


}
