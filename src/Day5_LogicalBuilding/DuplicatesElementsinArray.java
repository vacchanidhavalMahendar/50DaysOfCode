package Day5_LogicalBuilding;

//Question 10:WAP to find the duplicates elements in an array

import java.util.HashSet;

public class DuplicatesElementsinArray {
    public static void main(String[] args) {
String arr[]={"java","GO","python","golang","c++","java","python"};

//Approach 1
       boolean flag= false;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){

                    System.out.println("Found the Duplicates elements in array is"+arr[i]);
                    flag= true;
                }


            }

        }

        if(flag==false){
            System.out.println("Duplicates Elements Not Found");
        }


        //Approach 2:USING HASHSET->Here duplicates not allowed
        HashSet<String> langs=new HashSet<>();
        for(String l:arr){
            if(langs.add(l)==false){
                System.out.println("Found the Duplicates elements"+l);
                flag=true;
            }
        }

        if(flag==false){
            System.out.println("Not Found the Duplcates Elements");
        }



    }
}
