package JavaPracticesProblem;

import java.util.Scanner;

public class FindEvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Value:");
        int val= sc.nextInt();

        int even_count=0;
        int odd_count=0;


        while(val>0){
            int num=val%10;

            if((num/2)==0){
                even_count ++;
            }
            else{
                odd_count ++;
            }
            val=val/10;
        }
        System.out.println(even_count+"Even Numbers ");
        System.out.println(odd_count+"Odd Numbers");

    }
}
