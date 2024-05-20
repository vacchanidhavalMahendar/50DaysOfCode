package Day3_LogicBuilding;

//Question 5:: WAP to find the minimum element in an array
public class MinimumElementinArray {
    public static void main(String[] args) {

        int arr[]={20,30,50,60,5,4,3,80};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The Minimum Element in an array is"+ " "+ min);

    }
}
