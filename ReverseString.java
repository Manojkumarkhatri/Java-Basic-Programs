package JavaPracticesProblem;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an String:");
        String s =sc.nextLine();
        String rev="";
        for (int i=(s.length()-1) ; i>=0 ; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

    }
}
