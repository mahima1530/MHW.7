package WEEK7HW;
/*22. Write a Java program to calculate the average value of array elements.*/
public class Q_22 {

    public static void main(String[] args) {
        EC();
    }



    public static void EC(){
        int[] num = {10, 20, 30, 25, 35, -15, 50, -60, 80, 90,-100};
        //calculate sum of all array elements
        int sum = 0;
        for(int S=0; S < num.length ; S++)
            sum = sum + num[S];
        //calculate average value
        double average = sum / num.length;
        System.out.println("Average value of the array elements is : " + average);


    }
}
