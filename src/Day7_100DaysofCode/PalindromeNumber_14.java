package Day7_100DaysofCode;

//Frequently Asked Java Program 04: Palindrome Number | How to Check Given Number is Palindrome or Not
//Palindrome Number: A Palindrome number is a number that remains the same,When the number is reversed,Like:16461

import java.util.Scanner;
public class PalindromeNumber_14 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num= sc.nextInt();

        int org_num=num;
        int rev=0;

        while(num!=0) {
            rev= rev*10 +num % 10; //0*10 +1234%10 =0+4 =4 ---> 4
            num= num/10;


        }

        if(org_num==rev) {
            System.out.println(org_num + "Palindrome Number");

        }

        else {
            System.out.println(org_num+"Not a Palindrome Number");
        }


    }
}

