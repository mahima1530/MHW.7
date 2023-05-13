package WEEK7HW;

/*21. Write a Java program to sum values of an array.*/
public class Q_21 {


    public static void main(String[] args) {
        value();
    }

    public static void value(){

        int num_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15};
        int sum = 0;

        for (int n : num_array)
            sum += n;
        System.out.println("The sum is " + sum);
    }
    }

