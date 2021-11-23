public class numChecker {
    public static void main(String[] args) {


        printNums(10,20,33);
    }


    public static void printNums(int a, int b, int c){

        if ((a>b) && (a> c))
        {
            System.out.println("The greatest number is "+ a);
        }
        if (b>a && b>c)
        {
            System.out.println("The greatest number is "+ b);

        }
        if (c>a && b<c)
        {
            System.out.println("The greatest number is "+ c);

        }
    }
}
