package WEEK7HW;

import java.util.Scanner;

/*9. Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/
public class w_9 {

    public static void main(String[] args) {
        jj();
    }


    public static void jj(){
        Scanner SH = new Scanner(System.in);

        System.out.println("Enter number of class held");
        float Ca = SH.nextFloat();

        System.out.println("Enter number of class attend");
        float Ch = SH.nextFloat();

        System.out.println("Did student have any medical cause \"true or false?\"");
        boolean medical = SH.nextBoolean();

        if(Ca/Ch*100 >75 ) {
            System.out.println("You are allowed to sit in exam with "+Ca/Ch*100 +" Percentage of attendance");
        }

        if (medical) {
            System.out.println("You are allowed to sit in exam with "+Ca/Ch*100 +" Percentage of attendance");
        }

        else {
            System.out.println("You are not allowed to sit in exam with "+ Ca/Ch*100 + " Percentage of attendance");
        }

    }

}
