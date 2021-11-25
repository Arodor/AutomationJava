import java.util.Scanner;

public class SquareAndAreOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter rectangle size A and B:");
        int sizeB = input.nextInt();
        int sizeA = input.nextInt();
        input.close();

        System.out.println("The area of the rectangle is: " + area(sizeA, sizeB));
        System.out.println("The perimeter of the rectangle is: " + perimeter(sizeA, sizeB));
    }

    private static int area(int a, int b) {
        return a * b;
    }

    private static int perimeter(int a, int b) {
        return 2 * (a + b);
    }
}
