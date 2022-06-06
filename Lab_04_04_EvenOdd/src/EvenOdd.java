public class EvenOdd {
    public static void main(String[] args)
    {
        int numToExamine = 4;
        int num2 = 2;
        int remainder;

        remainder = numToExamine % num2;

        if (remainder == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }




    }
}
