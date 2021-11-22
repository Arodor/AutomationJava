import java.util.Scanner;

public class addStringInSentence {

    public static void main(String[] args) {

        String sentance;
        Scanner userInput = new Scanner(System.in);
        sentance = userInput.nextLine();
        System.out.println("Hello, "+sentance+"!");
    }

}
