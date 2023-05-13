package WEEK7HW;
/*20. Write a Java program to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Q_20 {

    public static void main(String[] args) {
        NS();
    }


    public static void NS(){

        int[] num_array1 = {
                17, 20, 18, 14, 21,
                45, 58, 12, 72, 23,
                56, 16, 55, 15, 50,
                105,345,200,80, 10,};

        String[] name_array2 = {
                "Punam",
                "Falguni",
                "Madhavi",
                "Hiral",
                "Kruti",
                "Hemi",
                "Situ",
                "vidhi",
        };
        System.out.println("Original numeric array : "+ Arrays.toString(num_array1));
        Arrays.sort(num_array1);
        System.out.println("Sorted numeric array : "+Arrays.toString(num_array1));

        System.out.println("Original string array : "+Arrays.toString(name_array2));
        Arrays.sort(name_array2);
        System.out.println("Sorted string array : "+Arrays.toString(name_array2));
    }
}




