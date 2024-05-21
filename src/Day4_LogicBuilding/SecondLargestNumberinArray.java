package Day4_LogicBuilding;

//Question 7:WAP to find the second largest element in an array
//Sort the array and Pick the number at (n-2) Index
//Time Complexity of sorting an arrau is 0(n log n)
//Sorting approach will not work,If the  element of an array is repeated

import java.util.Arrays;

public class SecondLargestNumberinArray {
    public static void main(String[] args) {

        //Unsorted array
        int arr[]={1,2,3,10,15,35,40,11,14};

        int n= arr.length;

        //Sorting the array
        Arrays.sort(arr);

        //Here first largest numbert is :40
        //Second Largest Number is::35

            System.out.println("Second highest number is"+" "+arr[n-2]);


            //Approach 2
        int highest=Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        //Traversing an array
        for(int i=0;i<n;i++)

        {

            if(arr[i]> highest){
                secondHighest=highest;
                highest=arr[i];

            }

            if(arr[i]<highest && arr[i]>secondHighest){
                secondHighest=arr[i];
            }
        }
        System.out.println("Second Highest"+ secondHighest);
    }
}
