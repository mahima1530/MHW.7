package WEEK7HW;

import java.util.Scanner;

/*26. Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd */
public class Q_26 {

    public static void main(String[] args) {
        ss();
    }

    public static void ss() {

        Scanner sc = new Scanner(System.in);
       String word = sc.next();
        System.out.println(word);//original string
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);//reverse string


    }
}
