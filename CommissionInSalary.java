package JavaPracticesProblem;

import java.util.Scanner;

public class CommissionInSalary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Salary:");
        double sale= sc.nextInt();

        double percentage= (9.0/100.0)*sale;
        if (sale>=5000) {
            double salary = 200 + percentage;
            System.out.println("Salary is :" + salary);
        }
        else{
            System.out.println("Salary is :"+200);
        }

    }

}
