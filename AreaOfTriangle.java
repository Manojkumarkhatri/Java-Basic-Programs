package JavaPracticesProblem;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the Value of b:");
        int b=sc.nextInt();
        System.out.println("Enter Value of c:");
        int c=sc.nextInt();
        double pow=1/2;

        int s= (a+b+c)/2;

        int area= s*(s-a)*(s-b)*(s-c);
        System.out.println("area=" + Math.sqrt(area));

    }
}
