package Day11_LogicalBuilding;

import java.util.Random;

//22: How To Generate Random Numbers & Strings | Apache Commons API
public class GenerateRandomNumberString_22 {
    public static void main(String[] args) {
        //Approach 1: Random Class

        Random random= new Random();

        int rand_int=random.nextInt(999);
        System.out.println(rand_int);

        double rand_db1= random.nextDouble(); //range 0.0 and less than 2.0
        System.out.println(rand_db1);


        //Approach2:Math
        Math.random();
        System.out.println(Math.random());



    }

}

