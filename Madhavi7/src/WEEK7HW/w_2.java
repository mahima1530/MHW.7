package WEEK7HW;

/*2. Print multiplication table of 24, 50 and 29 using loop.*/
public class w_2 {

    public static void main(String[] args) {
        gg();
    }

    public static void gg() {

        // number n for which we have to print the
        // multiplication table.
        int N = 29;

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(N + " * " + i + " = "
                    + N * i);

        }
        System.out.println();

        // number n for which we have to print the
        // multiplication table.
        int F = 50;

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(F + " * " + i + " = "
                    + F * i);

        }
        System.out.println();
        // number n for which we have to print the
        // multiplication table.
        int H = 24;

        // looping from 1 to 10 to print the multiplication
        // table of the number.
        // using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the N*i,ie ith multiple of N.
            System.out.println(H + " * " + i + " = "
                    + H * i);
        }
    }
}