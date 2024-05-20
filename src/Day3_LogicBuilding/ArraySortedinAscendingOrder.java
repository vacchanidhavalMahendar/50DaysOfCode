package Day3_LogicBuilding;

//Question 6:::WAP to to check if an array is sorted in ascending order

import java.util.Arrays;

public class ArraySortedinAscendingOrder {
    public static void main(String[] args) {

        int arr[]={3,4,60,50,6,7,0,1,6,8};

            System.out.print("The Original Array is: ");

            for(int i=0;i<arr.length;i++){

                System.out.print( arr[i]+" ");
            }

            int temp=0;
            for(int i=0;i< arr.length;i++){
                for(int j=i+1;j< arr.length;j++){
                    if(arr[j]<arr[i]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]= temp;

                    }

                }

            }
        System.out.print("\n The Sorted Array in ascending order is: ");

        for(int i=0;i<arr.length;i++){

            System.out.print( arr[i]+" ");
        }


    }


}
