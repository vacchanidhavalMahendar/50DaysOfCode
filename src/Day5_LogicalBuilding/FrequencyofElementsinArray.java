package Day5_LogicalBuilding;


//Question 10::Frequency of each element in an array
public class FrequencyofElementsinArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,2,6,6,3,7};
        int[] visitedArray=new int[arr.length];

        int visited=-1;
        for(int i=0;i< arr.length;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]) {
                    count++;
                    visitedArray[j] = visited;
                }
            }
            if(visitedArray[i]!=visited){
                visitedArray[i]=count;
            }
        }
        for(int i=0;i<visitedArray.length;i++){
            if(visitedArray[i]!= visited){
                System.out.println("Frequency of "+ arr[i]  + " : " + visitedArray[i]);

            }

        }
    }
}
