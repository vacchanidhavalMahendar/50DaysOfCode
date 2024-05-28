package Day10_LogicBuilding;

//// Frequently Asked Java Program 09: Find Largest Of 3 Numbers | 2 Different Ways
////Logic
//// a=10 b=20 c=30
////Condition 1: a> b and a>c then a is largest
////b>a and b >C-->b is largest
//// c>a and c>b---> c is largest

import java.util.Scanner;

public class LargestOfThreeNumbers_19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();

        System.out.println("Enter the Second Number");
        int b=sc.nextInt();

        System.out.println("Enter the Third Number");
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("Here  a is the greatest number" + " "+a);
        }
        else if(b>c&&b>a){
            System.out.println("Here  b is the greatest number" + " "+b);
        }
        else{
            System.out.println("Hence c is the greatest number" +c);
        }
    }
}
