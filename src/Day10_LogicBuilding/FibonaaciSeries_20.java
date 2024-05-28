package Day10_LogicBuilding;

//Frequently Asked Java Program 10: Generate Fibonacci series
//A Series of Numbers in Which Each Number(Fibonacci Number) ,Is the Sum of the two preceding Numbers
//// 0 1  1  2  3  5  8 13
public class FibonaaciSeries_20 {
    public static void main(String[] args) {

        int n1=0,n2=1,sum=0;
        System.out.println(n1+ " "+n2);

        for(int i=2;i<10;i++){
            sum=n1+n2;      //0+1=1
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;

        }

    }
}
