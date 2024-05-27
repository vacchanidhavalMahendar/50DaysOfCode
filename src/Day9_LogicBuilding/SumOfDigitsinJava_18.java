package Day9_LogicBuilding;
//Frequently Asked Java Program 08: Count Sum Of Digits in a Number
//Sum of Digits in a Number
//Number:1234 -->Sum=10

//Logic
//From Given number:1234 and sum=0 and we are extracting the last digit from that number and adding to the sum variable
//sum =4+3+2+1=10
//By using the modulus operator ,we are getting remainder as value ---> 1234%10 and Adding the last digit to the sum


public class SumOfDigitsinJava_18 {
    public static void main(String[] args) {

        int num=1234;
        int sum=0;
        while(num>0){
            sum=sum+num%10;  // 4  3
            num=num/10; //123-Its an division operator and it will eliminate the last digit --->12--->1
        }
        System.out.println("Sum of Digits in a Number"+" "+ sum);

    }
}
