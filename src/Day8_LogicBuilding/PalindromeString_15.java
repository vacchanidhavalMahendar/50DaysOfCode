package Day8_LogicBuilding;

// Question 15:: Palindrome String | How to Check Given String is Palindrome or Not

import java.util.Scanner;

//Logic Explanation
//Palindrome String : A palindrome String is a String,That remains like same,When its Characters are reversed,Like MADAM.
public class PalindromeString_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str= sc.nextLine();
        String originalString= str;
        String reverseString="";

        int len=str.length();

        for(int i= len-1;i>=0;i--){
            reverseString=reverseString+str.charAt(i);
        }
        System.out.println("The Reverse String is"+reverseString);

        if(originalString.equals(reverseString)){
            System.out.println(originalString + " :" +"The String is palindrome");
        }
        else{
            System.out.println(originalString +" :" +"The String is not Palindrome");
        }








    }
}
