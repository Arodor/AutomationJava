import java.util.Scanner;

public class checkStrings {
    public static void main(String[] args) {
        String firstInput;
        String SecondInput;

        Scanner input = new Scanner(System.in);

        System.out.println("We are going to compare two words of your choice");
        System.out.println("Please enter the first word: ");
        firstInput = input.nextLine();

        System.out.println("Please enter the second word: ");
        SecondInput = input.nextLine();
        input.close();


        if (firstInput.equals(SecondInput)) {
            System.out.println("The words you have entered are same!");
        } else {
            System.out.println("The words you have entered are not the same!!");
        }

    }
}
