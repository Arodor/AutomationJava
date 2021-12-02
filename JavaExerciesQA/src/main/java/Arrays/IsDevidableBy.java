package Arrays;

import java.util.Scanner;

public class IsDevidableBy {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        int firstNumber = inputNum.nextInt();
        int secondNumber = inputNum.nextInt();
        inputNum.close();


        //Print is numb which can not be divided by 3 or 7

        dividerChecker(firstNumber, secondNumber);
    }
    private static void dividerChecker(int a, int b) {

        for (int i = a; i <=b ; i++) {

            if (i % 3 !=0 && i % 7 != 0){
                System.out.println(i);
            }

        }

    }
}
