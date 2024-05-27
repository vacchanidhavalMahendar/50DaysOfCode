package Day9_LogicBuilding;
//Frequently Asked Java Program 07: Count Number Of EVEN & ODD Digits in A Number
//Number of Even and Odd Digits in a Number
//Number=145678 -->Even Digits:3 and Odd Digits:3


//Logic Number:7312 and two different variable evenNum and oddNum and we need to extract last digit from that number,If its an even then increase the count and if its an odd number ,Then increase the odd count and again eliminate the last number and repeat the same process
//if any num%10-->as a remainder it will give the last digit

public class CountEvenOrOdd_17 {
    public static void main(String[] args) {

        int num=1234;  // we have 2 even and 2 odd

        int even_count=0;
        int odd_count=0;

        //Check number is >0
        //from that number we need to extract last digit by num % 10
        while(num>0) {  //1234  -->123  --->12

            int remainder= num %10;  //4  -->3   --> 2 -->1
            if(remainder%2==0) {
                even_count++;   //1   -->2
            }
            else {
                odd_count++;   //1 -->2
            }

            num=num/10;   //Eliminate the last digit so we get 123  --->12  --->1  --> 0
        }

        System.out.println("Number of Even Numbers"+even_count);
        System.out.println("Number of Odd Numbers"+odd_count);
    }

}


