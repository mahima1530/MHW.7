package WEEK7HW;
/* 14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
5 separately.*/

public class Q_14 {

    public static void main(String[] args) {
        program();
    }


    public static void program(){

        System.out.println("\nDivided by 3: ");
        for (int k=1; k<100; k++)
            if (k%3==0)
        System.out.println(k + ",") ;




        System.out.println("\nDivided by 5: ");
        for (int i=1; i<100; i++)
            if (i%5==0)
                System.out.println(i + ",");



        }


}
