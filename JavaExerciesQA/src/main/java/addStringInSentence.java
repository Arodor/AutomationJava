import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class addStringInSentence {

    public static void main(String[] args) {

        String sentance;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a word");

        sentance = userInput.nextLine().trim();
        userInput.close();
        System.out.println("Hello, " + sentance + "!");

    }

}
