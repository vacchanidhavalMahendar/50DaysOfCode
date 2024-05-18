package Day1_LogicBuilding;
//WAP to find the sum of all elements in an array
public class SumofElementinArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int sum=0;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The Sum of Elements in an array is"+ " " + sum);
    }
}
