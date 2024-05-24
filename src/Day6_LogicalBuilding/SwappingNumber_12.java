package Day6_LogicalBuilding;

//Question 12:Swapping the Number
public class SwappingNumber_12 {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        System.out.println("Before Swapping the values are :" +a + " "+b);

        //Logic 1:By using the third variables
        int t=a;
        a=b;
        b=t;
        System.out.println("After Swapping the values are" +  a+ " "+b);

        //Logic 2::Using addition and subtraction operator without using the third variables
        System.out.println("For Logic2-Before Swapping the values are"+a +" "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("For Logic2-After Swapping the values are"+a +" "+b);

        //Logic 3: Use * and / without using third variables
        //Here a& b values should not be zerp
        System.out.println("For Logic3-Before Swapping the values are " +  a + "   "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("For Logic3-After Swapping the values are"+  a +"   "+b);
    }
}
