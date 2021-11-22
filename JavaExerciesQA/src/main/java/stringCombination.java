import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class stringCombination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstInput = input.nextLine();
        String secondInput = input.nextLine();
        String thirdInput = input.nextLine();
        String fourthInput = input.nextLine();

        //buffer clear
        input.close();

        System.out.println(firstInput + secondInput + thirdInput + fourthInput);

    }

}
