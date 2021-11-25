import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        System.out.println("Please enter a number for a week: ");

        String weekDay;
        int number = inputNum.nextInt();
        inputNum.close();

        switch (number) {
            case 1:
                weekDay = "Monday";
                System.out.println("You have selected 1. Day of the week is " + weekDay);
                break;
            case 2:
                weekDay = "Tuesday";
                System.out.println("You have selected 2. Day of the week is " + weekDay);

                break;
            case 3:
                weekDay = "Wednesday";
                System.out.println("You have selected 3. Day of the week is " + weekDay);

                break;
            case 4:
                weekDay = "Thursday";
                System.out.println("You have selected 4. Day of the week is " + weekDay);
                break;
            case 5:
                weekDay = "Friday";
                System.out.println("You have selected 5. Day of the week is " + weekDay);
                break;
            case 6:
                weekDay = "Saturday";
                System.out.println("You have selected 6. Day of the week is " + weekDay);

                break;
            case 7:
                weekDay = "Sunday";
                System.out.println("You have selected 7. Day of the week is " + weekDay);

                break;
            default:
                System.out.println("Invalid number of a week, please try again!");
        }

    }
}