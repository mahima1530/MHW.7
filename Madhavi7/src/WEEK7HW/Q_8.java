package WEEK7HW;
/*8. Write a java program to get numbers from users and print
 whether it is positive or negative.
 */

import java.util.Scanner;

public class Q_8 {  /*     if(condition){
                  if body;
           }else if (condition){
                 else if body;
           }else{
                 else body;
          }     */
    public static void main(String[] args) {
        pn();
    }


    public static void pn(){

        Scanner RE = new Scanner(System.in);
        System.out.println("Enter the number:");
        int  n = RE.nextInt();
        if (n>0){
        System.out.println("The given number" + "n"  + "is positive");}
        else if (n<0){

        System.out.println("The given number" +  "n" + "is negative");}
        else {
            System.out.println("The given number"  +  "n"  +   "is neither positive nor negative");
        }







    }

}
