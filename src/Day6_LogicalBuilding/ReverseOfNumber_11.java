package Day6_LogicalBuilding;
import java.util.Scanner;

public class ReverseOfNumber_11 {
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter a Number::");
            int num=sc.nextInt();  //1234   -->Reverse:4321



//Logic 1:Using Algorithm

            /*
             * int rev=0;
             *
             * while(num!=0) { rev= rev*10 +num%10; //0*10 +1234%10 =0+4 =4 ---> 4
             * *10+123%10=40+3=43 ---->43*10 +12/10 =430+2=432 ------>432*10 +
             * 1%10=4320+1=4321 num= num/10; //1234/10=123, means 4 is eliminated----->
             * 123/10=12,so 3 is eliminated---->12/10= 1 and so 2 is eliminated, }
             *
             * System.out.println("Reverse Number is ::"+rev);
             */


//Logic 2::Using StringBuffer class

/*
StringBuffer sb= new StringBuffer(String.valueOf(num)); //String.valueof(num):It will convert the number type into String Type
StringBuffer rev=sb.reverse();
System.out.println("reverse number is "+ rev);
*/


//Logic 3:Using StringBuilder Class

            StringBuilder sb1= new StringBuilder();
            sb1.append(num);

            StringBuilder rev=sb1.reverse();

            System.out.println("Reverse a number is"+ rev);



        }

    }


