package Day12_LogicBuilding;

//14: Find Sum of Elements in Array
public class SumOfElementinArray_24 {
    public static void main(String[] args) {

        int[] a= {5,2,7,9,6};
        int sum=0;

        	/*for(int i=0;i<=a.length-1;i++) {  //a.length-1 =5-1=4   --> 0 1 2

			sum=sum+a[i];   // 0 +5=5 ---> 5+2=7--->  7+3=10   ---> 5+2+7+9+6

		}
		*/
        //Enhanced For Loop

        for(int value:a) {   //5 is assigned to value
            sum=sum+value;  // 0+5 =5.

        }
        System.out.println("The Sum of All the Array Elements"+ sum);




    }

}


