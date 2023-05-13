package WEEK7HW;
/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format*/

import java.util.Scanner;

public class Q_6 {
    public String employeid;
    public String employename;
    public int basicsalary,HRA,DA,GS,incometax,netsalary;
    public void read()
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the employee id");
        employeid=ss.next();
        System.out.println("Enter the employee name");
        employename=ss.next();
        System.out.println("Enter the basic salary");
        basicsalary= Integer.parseInt(ss.next());
        calculate();

    }
    public void calculate() // calculating parameter
    {
        HRA=(10/100)*basicsalary;
        DA=(73/100)*basicsalary;
        GS=(basicsalary+DA+HRA);
        incometax=(30/100)*GS;
        netsalary=GS-incometax;
        display();
    }
    public void display() //dispalying calculating parameters
    {
        System.out.println("Employeeid :  " + employeid + "n" + "employename  " + employename);


        System.out.println("|               Salary Slip          |");
        System.out.println("|                                    |");
        System.out.println("|------------------------------------|");
        System.out.println("| Employee Id            :2564       |");
        System.out.println("| Employee Name          :Jay        |");
        System.out.println("|____________________________________|");
        System.out.println("| Basic Salary           : 25000.0   |");
        System.out.println("| HRA 10%                :2500.0     |");
        System.out.println("|TA 8%                   :2250.0     |");
        System.out.println("|DA 9%                   :2000.0     |");
        System.out.println("|PF- 20&                 :5000.0     |");
        System.out.println("|____________________________________|");
        System.out.println("|                                    |");
        System.out.println("| Gross Salary           :26750.0    |");
        System.out.println("|====================================|");











        // System.out.println(|"_____________________________________________"|);
//        System.out.println(|"                                              "|);
//        System.out.println(|"Employee              : 2564                  "|);
//        System.out.println(|"Employee Name         : Jay                   "|);
//        System.out.println(|"______________________________________________"|);
//        System.out.println(|" Basic Salary         :25000.0                "|);
//        System.out.println(|" HRA 10%              :2500.0                 "|);
//        System.out.println(|" TA 8%                :2250.0                 "|);
//        System.out.println(|" DA 9%                :2000.0                 "|);
//        System.out.println(|" PF - 20&             :5000.0                 "|);
//        System.out.println(|"______________________________________________"|);
//        System.out.println(|"                                             " |);
//        System.out.println(|" Gross Salary          :26750                 "|);
//        System.out.println(|"=============================================="|);
//
    }

    public static void main(String[] args) {
        Q_6 employee = new Q_6();
        employee.read(); // calling read function


    }
}
