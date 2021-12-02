package Arrays;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int firstNumber = inputNum.nextInt();
        int secondNumber = inputNum.nextInt();
        inputNum.close();

        //Print input ---- First num to second num
        printFirstNumToSecondNum(firstNumber, secondNumber);

    }

    private static void printFirstNumToSecondNum(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);

        }
    }


}
