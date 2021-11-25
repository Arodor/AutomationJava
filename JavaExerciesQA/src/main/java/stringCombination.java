import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class stringCombination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first word: ");
        String firstInput = input.nextLine().trim();

        System.out.println("Please enter your second word: ");
        String secondInput = input.nextLine().trim();

        System.out.println("Please enter your third word: ");
        String thirdInput = input.nextLine().trim();

        System.out.println("Please enter your fourth word: ");
        String fourthInput = input.nextLine().trim();

        //buffer clear
        input.close();

        System.out.println("The combination of your words is: " + firstInput + secondInput + thirdInput + fourthInput);

    }

}
