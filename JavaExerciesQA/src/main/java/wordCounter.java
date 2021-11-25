import java.util.Scanner;

public class wordCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String input = scanner.nextLine();
        scanner.close();

        //word count
        int countWords = 0;

        // Empty input check
        if (input.isEmpty()) {
            System.out.println("You have not entered anything, please try again!");
        } else {
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == ' ' && input.charAt(i + 1) != ' ')
                    countWords++;
            }

            System.out.println("Total words are: " + (countWords + 1));
        }
    }
}