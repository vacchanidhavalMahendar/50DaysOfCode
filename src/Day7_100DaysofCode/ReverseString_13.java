package Day7_100DaysofCode;

//Question 13:WAP to Reverse the string ->ABCD -->DCBA
public class ReverseString_13 {
    public static void main(String[] args) {

        //Reverse the string in three different approach
        //String str="dhavalpatel";
        //Step 1:We will find the length of the string
        //Step 2:With for loop,We iterate and Every time,We iterate,Extract the Characters from the string
        //Step 3:: Each charcter is assigned to another variables //patellavadha
        //length()-->Method  and extract the characters We,use  charAt() Method.


        //Logic 1::: Using +(String Concatenation) Operator
        String str="DhavalPatel";
        String rev=""; //We dont have  any string value.So default value is null.

        int len=str.length();  //Starts from 1
        //As Per  charAt() method index is starting from zero.

        for(int i=len-1;i>=0;i--){
            rev=rev + str.charAt(i); //from string it will extract the character and add that value in rev variable  //charAt(3) -->D   --> //DCBA
        }
        System.out.println("Reverse of the String is" + rev);


        //Logic 2: Using Character Array
        char a[]=str.toCharArray(); //Convert string into multiple character
        //so first i will extract the First character and Add that Character into some  reverse variables
        int len1= a.length; //4
        for(int i=len1-1;i>=0;i--) {  // 3 2 1 0
            rev= rev+a[i];   //DCBA --->
        }
        System.out.println("Reverse of the String is"+ rev);

        //3.Using StringBuffer class

        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.out.println("The reverse of the String is "+ sb);
    }
}
