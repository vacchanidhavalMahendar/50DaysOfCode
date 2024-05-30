package Day12_LogicBuilding;


//Factorial: A factorial is a function,That  Multiplies a Number by every number below it

//Example
//5!=5*4*3*2*1 =120 or
//5!=1*2*3*4*5=120

//We will go from low to high
public class FactorialOfNumber_23 {
    public static void main(String[] args) {

        int num=5;
        long factorial=1;
        for(int i=num;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println("The Factorial of the Given Number is"+ factorial);

    }
}
