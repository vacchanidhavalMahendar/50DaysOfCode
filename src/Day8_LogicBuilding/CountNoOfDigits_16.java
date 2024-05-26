package Day8_LogicBuilding;

//6.Frequently Asked Java Program 06: Count Number Of Digits in A Number

//Number=145678 --->Expected Result: Number of Digits:6


//Logic:we have one number and we need to divide the number by 10 thelast digit is eliminated
//Immediately specify the variable and it will increase the count++


public class CountNoOfDigits_16 {
    public static void main(String[] args) {

        int num=1234567;
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("The Number of Digits are" + " :" + count);

    }
}
