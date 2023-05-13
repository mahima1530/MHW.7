package WEEK7HW;
/*5. Take two int values from user and print greatest among them.*/

public class w_5 {


    public static void main(String[] args) {
        numbers();
    }


    public static void numbers(){

        int num1 = 80, num2 = 20;
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is greater");

        else
            System.out.println (num2 + " is greater");

    }




}
