package Day2_LogicalBuilding;

import java.util.Arrays;

//Question 4:WAP to find the maximum element in an array
public class MaximumElementArray {
    public static void main(String[] args) {

        int arr[]={10,20,50,60,1880,30,40,190};
        int max=arr[0];
        for(int i=0;i< arr.length;i++){

            if(arr[i]>max){
                max=arr[i];
            }


        }
        System.out.println("The Maximum Element in an array"+ " " + max);
    }
}
