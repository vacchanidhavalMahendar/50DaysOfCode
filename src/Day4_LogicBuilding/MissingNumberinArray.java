package Day4_LogicBuilding;


//Question 8::Missing number in array

//Logic
//Arrays should not have duplicates
//Array No need to be in the sorted order
//Values should be in range

public class MissingNumberinArray {
    public static void main(String[] args) {

        int arr[]={1,2,4,5};
        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //sum2-sum1=15-12=3 Missing Number found

        int sum1=0;
        for(int i=0;i< arr.length;i++){
            sum1=sum1+arr[i];
        }
        System.out.println("The sum of Elements in an array"+sum1);

        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("The sum of Elements in an array"+sum2);


        System.out.println("Missing Number in an array is"+(sum2-sum1));


    }
}
