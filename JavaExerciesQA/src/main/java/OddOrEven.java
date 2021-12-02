import java.sql.SQLOutput;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer number");
        oddOrEvenChecker(input.nextInt());

    }

    private static void oddOrEvenChecker(int a) {

        if (a % 2 == 0) {
            System.out.println("The number you have entered is even.");
        } else {
            System.out.println("The number you have entered is odd.");
        }
    }
}




