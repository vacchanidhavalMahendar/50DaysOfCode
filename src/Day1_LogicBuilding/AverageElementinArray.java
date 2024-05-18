package Day1_LogicBuilding;

//WAP to find the average of elements in an array
public class AverageElementinArray {

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50,60,70,80,90,100};

        int avgElement=0;


        for(int i=0;i<arr.length;i++){
            avgElement=avgElement +arr[i]/ arr.length;
        }
        System.out.println("The Average of Elements in an array is"+ "   "+avgElement);

    }
}
