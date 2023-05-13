package WEEK7HW;

import java.util.Scanner;

/* 5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class Q_5 {



    public static void main(String[] args){
        m_sheet();
    }

    public static void m_sheet (){

        Scanner CC = new Scanner(System.in);

        System.out.println("Enter Student Name  :  "); //input student name
        String studentname = CC.nextLine();

        System.out.println("Enter Roll No        :   ");// input roll no
        String rollno = CC.nextLine();

        // input marks for 3 subjects
        System.out.println("Enter marks for Maths: ");
        int M_marksheet = CC.nextInt();
        System.out.println("Enter Marks of Science");
        int S_marksheet = CC.nextInt();
        System.out.println(" Enter Mark of English");
        int E_marksheet = CC.nextInt();
        int t = M_marksheet + S_marksheet + E_marksheet;
        double p = t / 500 * 100;
        String g = "";

        if(p>=90)
            g ="A+";
        else if (p >=80)
            g ="A";
        else if(p>=70)
            g ="B+";
        else
            g ="E";
        System.out.println("Total Marks = " + t);
        System.out.println("Percentage  ="  + p);
        System.out.println("Grade = "  + g);


        System.out.println("|---------------------------------------------|");
        System.out.println("|                 Mark Sheet                  |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|   Name                    :       08        |");
        System.out.println("|   Roll No                 :       23        |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|   Subjects                :            Marks|");
        System.out.println("|---------------------------------------------|");
        System.out.println("|   Math                    :             98  |");
        System.out.println("|   Science                 :             90  |");
        System.out.println("|   English                 :             85  |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|   Total                   :             273 |");
        System.out.println("|---------------------------------------------|");
        System.out.println("|   Percentage              :             91.0|");
        System.out.println("|   Result                  :             Pass|");
        System.out.println("|   Grade                   :              A+ |");
        System.out.println("|_____________________________________________|");


    }



}
