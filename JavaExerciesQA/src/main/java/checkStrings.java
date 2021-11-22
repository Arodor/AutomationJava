import java.util.Scanner;

public class checkStrings {
    public static void main(String[] args) {
        String firstInput;
        String SecondInput;

        Scanner input = new Scanner(System.in);

        firstInput = input.nextLine();
        SecondInput = input.nextLine();
        input.close();


        if (firstInput.equals(SecondInput)){
            System.out.println("The stings are equal!!");
        }
        else {
            System.out.println("We can not compare the two words as they are different.");
        }

    }
}
